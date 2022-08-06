/*
 * Author : AdNovum Informatik AG
 */

package Learning_java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import Learning_java.Entity.TestSteps;
import Learning_java.Entity.Testcase;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public Map<String, Testcase> readFileExcel() {
		Map<String, Testcase> testcaseMap = new HashMap<>();
		try {
			Testcase testcasetTemp;
			List<TestSteps> testStepList = null;

			File file = getFileFromResource("Pratice_Java_all.xlxs");

			FileInputStream excelFile = new FileInputStream(file);
			// co duoc file excel trong workbook
			Workbook workbook = new XSSFWorkbook(excelFile);
			// lay ra data cua sheet dau tien
			// lay sheet dau tien theo index
			// => Sheet testcaseSheet = workbook.getSheetAt(0);
			// lay sheet theo ten sheet
			Sheet testcaseSheet = workbook.getSheet("testcase");
			Iterator<Row> iterator = testcaseSheet.iterator();
			// kiem tra xem con dong tiep theo hay k
			while (iterator.hasNext()) {
				// lay row tiep theo
				Row currentRow = iterator.next();
				if (currentRow.getRowNum() >= 2) {

					TestSteps testSteps = new TestSteps();
					String testcaseID = currentRow.getCell(0).getStringCellValue();
					// trim() => xoa ky tu trang o 2 ben
					if (testcaseID != null && testcaseID.trim().length() > 0) {
						testcasetTemp = new Testcase();
						testcasetTemp.setId(testcaseID);
						String testcaseName = currentRow.getCell(1).getStringCellValue();
						testcasetTemp.setName(testcaseName);
						String testcaseDescription = currentRow.getCell(2).getStringCellValue();
						testcasetTemp.setDescription(testcaseDescription);

						testStepList = new ArrayList<>();
						testcasetTemp.setSteps(testStepList);
						testcaseMap.put(testcaseID, testcasetTemp);
					}
					testSteps.setAction(currentRow.getCell(3).getStringCellValue());
					testSteps.setLocation(currentRow.getCell(4).getStringCellValue());
					testSteps.setExpected(currentRow.getCell(5).getStringCellValue());
					testStepList.add(testSteps);
				}
			}
		} catch(URISyntaxException | FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return testcaseMap;
	}

	private File getFileFromResource(String fileName) throws URISyntaxException {

		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(fileName);
		if (resource == null) {
			throw new IllegalArgumentException("file not found! " + fileName);
		} else {
			return new File(resource.toURI());
		}

	}

}
