package com.reusable;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.base.Library;
import com.github.dockerjava.api.command.CopyFileFromContainerCmd;

public class Reuseble extends Library {

	public void to_Click(WebElement element) {

		element.click();

	}

	public void enter_value(WebElement element, String value) {

		element.sendKeys(value);

	}

	public void Screen_shot(String file_path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File image = ts.getScreenshotAs(OutputType.FILE);

		File f = new File(file_path);

		FileUtils.copyDirectory(image, f);

	}
	
	

}
