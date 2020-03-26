package com.Crossword.ExcelUtility;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class PollingUtils {

	private static PollingUtils INSTANCE = new PollingUtils();

	public static PollingUtils get() {
		return INSTANCE;
	}

	public WebElement getElementBy(final WebDriver webDriver, final By by) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			System.out.println(
					"Find the ELement " + by + " with timeOut:pollingInterval as " + timeOut + ":" + pollingInterval);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element :" + by + ". Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

		WebElement element = webDriver.findElement(by);
		return element;
	}

	public WebElement getElementBy(final WebDriver webDriver, final By by, int timeOut, int pollingInterval)
			throws TimeoutException {
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			System.out.println(
					"Find the ELement " + by + " with timeOut:pollingInterval as " + timeOut + ":" + pollingInterval);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element :" + by + ". Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

		WebElement element = webDriver.findElement(by);
		return element;

	}

	public List<WebElement> getElementListBy(final WebDriver webDriver, final By by, int timeOut, int pollingInterval)
			throws TimeoutException {
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			System.out.println(
					"Find the ELement " + by + " with timeOut:pollingInterval as " + timeOut + ":" + pollingInterval);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element :" + by + ". Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

		List<WebElement> elementList = webDriver.findElements(by);
		return elementList;
	}

	public List<WebElement> getElementListBy(final WebDriver webDriver, final By by) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			System.out.println(
					"Find the ELement " + by + " with timeOut:pollingInterval as " + timeOut + ":" + pollingInterval);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element :" + by + ". Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

		List<WebElement> elementList = webDriver.findElements(by);
		return elementList;
	}

	public List<WebElement> getElementListIfPresent(final WebDriver webDriver, final By by) {
		int pollingInterval = 1;
		int timeOut = 10;
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);
		try {
			System.out.println(
					"Find the ELement " + by + " with timeOut:pollingInterval as " + timeOut + ":" + pollingInterval);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		} catch (TimeoutException e) {

		}
		List<WebElement> elementList = webDriver.findElements(by);
		return elementList;

	}

	public List<WebElement> getElementListIfPresent(final WebDriver webDriver, final By by, int timeOut,
			int pollingInterval) {
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);
		try {
			System.out.println(
					"Find the ELement " + by + " with timeOut:pollingInterval as " + timeOut + ":" + pollingInterval);
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		} catch (TimeoutException e) {

		}
		List<WebElement> elementList = webDriver.findElements(by);
		return elementList;

	}

	public List<WebElement> getElementListBy(boolean checkEmptyNess, final WebDriver webDriver, final By by,
			int timeOut, int pollingInterval) {

		if (checkEmptyNess) {

			org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
					.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
					.ignoring(NoSuchElementException.class);

			try {
				System.out.println("Find the Element " + by + " with timeOut:pollingInterval as " + timeOut + ":"
						+ pollingInterval);
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
			} catch (TimeoutException e) {

				List<WebElement> elementList = new ArrayList<WebElement>();
				return elementList;

			}
		}
		List<WebElement> elementList = webDriver.findElements(by);
		return elementList;
	}

	public List<WebElement> getElementListBy(boolean checkEmptyNess, final WebDriver webDriver, final By by) {
		int pollingInterval = 1;
		int timeOut = 60;

		if (checkEmptyNess) {

			org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
					.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
					.ignoring(NoSuchElementException.class);

			try {
				System.out.println("Find the Element " + by + " with timeOut:pollingInterval as " + timeOut + ":"
						+ pollingInterval);
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
			} catch (TimeoutException e) {

				List<WebElement> elementList = new ArrayList<WebElement>();
				return elementList;

			}
		}
		List<WebElement> elementList = webDriver.findElements(by);
		return elementList;
	}

	public void waitForElementPresence(WebDriver webDriver, By by, int timeOut, int pollingInterval)
			throws TimeoutException {
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element :" + by + ". Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

	}

	public boolean waitForElementPresence(Boolean ignoreExceptionThrow, WebDriver webDriver, By by, int timeOut,
			int pollingInterval) throws TimeoutException {
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}
		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		if (ignoreExceptionThrow) {
			try {
			} catch (TimeoutException e) {
				System.out.println(
						"Does not Throw TimeoutException as this UTIL does not has that feature. Use other Function to Throw TimeoutException.");
				return false;
			}
		} else {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		}
		return true;

	}

	public void waitForElementPresence(WebDriver webDriver, By by) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element Clickable Search :" + by
					+ ". Found in the code at Class: " + i.getClassName() + " | Method: " + i.getMethodName()
					+ " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

	}

	public void waitForElementtobeClickable(WebDriver webDriver, By by, int timeOut, int pollingInterval)
			throws TimeoutException {
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for  element Clickable Search :" + by
					+ ". Found in the code at Class: " + i.getClassName() + " | Method: " + i.getMethodName()
					+ " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

	}

	public void waitForElementtobeClickable(WebDriver webDriver, By by) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element Clickable Search: " + by
					+ ". Found in the code at Class: " + i.getClassName() + " | Method: " + i.getMethodName()
					+ " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}
	}

	public void waitForElementtobeClickable2(WebDriver webDriver, WebElement by) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;

		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(by));
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for element Clickable Search: " + by
					+ ". Found in the code at Class: " + i.getClassName() + " | Method: " + i.getMethodName()
					+ " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}
	}

	public void waitForElementPresenceByExcpectedCondition(WebDriver webDriver,
			ExpectedCondition<WebElement> expectedCondMethodAndLocator) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			wait.until(expectedCondMethodAndLocator);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

	}

	public void checkPresenceOfAllElementsLocatedBy(WebDriver webDriver,
			ExpectedCondition<List<WebElement>> expectedCondMethodAndLocator) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		try {
			wait.until(expectedCondMethodAndLocator);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element List Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}
	}

	public void checkTextToBePresentInElementLocated(WebDriver webDriver, By by, String textValue)
			throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;

		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);
		ExpectedCondition<Boolean> expectedCondMethodAndLocator = ExpectedConditions.textToBePresentInElementLocated(by,
				textValue);

		try {
			wait.until(expectedCondMethodAndLocator);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();

			throw new TimeoutException(exceptionMessage, e);
		}
	}

	public void checkForFrameToBeAvailableAndSwitchToIt(WebDriver webDriver, By by) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 40;
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		ExpectedCondition<WebDriver> expectedCondition = ExpectedConditions.frameToBeAvailableAndSwitchToIt(by);

		try {
			wait.until(expectedCondition);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);

		}
	}

	public void checkForElementStaleness(WebDriver webDriver, By by, int timeOut, int pollingInterval)
			throws TimeoutException {
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		WebElement element = getElementBy(webDriver, by);
		ExpectedCondition<Boolean> expectedCondition = ExpectedConditions.stalenessOf(element);

		try {
			wait.until(expectedCondition);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}
	}

	public void checkForElementStaleness(WebDriver webDriver, WebElement element, int timeOut, int pollingInterval)
			throws TimeoutException {
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		ExpectedCondition<Boolean> expectedCondition = ExpectedConditions.stalenessOf(element);

		try {
			wait.until(expectedCondition);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

	}

	public void checkForElementStaleness(WebDriver webDriver, WebElement element) throws TimeoutException {
		int pollingInterval = 1;
		int timeOut = 60;
		if (webDriver == null) {
			throw new IllegalArgumentException("The WebDriver cannot be null.");
		}

		org.openqa.selenium.support.ui.Wait<WebDriver> wait = new FluentWait<WebDriver>(webDriver)
				.withTimeout(Duration.ofSeconds(timeOut)).pollingEvery(Duration.ofSeconds(pollingInterval))
				.ignoring(NoSuchElementException.class);

		ExpectedCondition<Boolean> expectedCondition = ExpectedConditions.stalenessOf(element);

		try {
			wait.until(expectedCondition);
		} catch (TimeoutException e) {
			StackTraceElement[] a = e.getStackTrace();
			StackTraceElement i = a[3];
			String exceptionMessage = "TimeoutException for ExpectedCondition for Element Search. Found in the code at Class: "
					+ i.getClassName() + " | Method: " + i.getMethodName() + " | Line_Number: " + i.getLineNumber();
			throw new TimeoutException(exceptionMessage, e);
		}

	}

}
