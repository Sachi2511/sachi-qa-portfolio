package utils;

import org.openqa.selenium.By;

/**
 * DynamicLocators
 *
 * This utility class demonstrates advanced locator-building techniques
 * using dynamic XPath and CSS strategies. It highlights problem‑solving
 * approaches for handling unstable attributes, nested DOM structures,
 * and dynamic UI elements.
 *
 * Each method solves a real-world locator challenge when static locators are not reliable.
 */
public class DynamicLocators {

    /**
     * Locate an element by exact visible text.
     * Useful when IDs are dynamic but text is stable.
     */
    public static By byText(String tag, String text) {
        return By.xpath("//" + tag + "[text()='" + text + "']");
    }

    /**
     * Locate an element using partial text match.
     * Helps when UI text changes slightly or includes dynamic values.
     */
    public static By byContainsText(String tag, String partialText) {
        return By.xpath("//" + tag + "[contains(text(),'" + partialText + "')]");
    }

    /**
     * Locate an element using a dynamic attribute.
     * Example: dynamic data-test, dynamic class fragments, etc.
     */
    public static By byAttribute(String tag, String attribute, String value) {
        return By.xpath("//" + tag + "[@" + attribute + "='" + value + "']");
    }

    /**
     * Locate an element using partial attribute match.
     * Useful when attributes contain dynamic prefixes/suffixes.
     */
    public static By byContainsAttribute(String tag, String attribute, String partialValue) {
        return By.xpath("//" + tag + "[contains(@" + attribute + ",'" + partialValue + "')]");
    }

    /**
     * Locate an element inside a component using ancestor axis.
     * Demonstrates DOM traversal and problem-solving.
     *
     * Example use case:
     * Find the "Add to Cart" button for a product based on product name.
     */
    public static By buttonInsideComponent(String componentClass, String itemName) {
        String xpath = "//div[@class='inventory_item_name' and text()='" + itemName + "']" +
                       "/ancestor::div[@class='" + componentClass + "']//button";
        return By.xpath(xpath);
    }

    /**
     * Locate an element by index when the list is dynamic.
     * Useful for grids, product lists, or search results.
     */
    public static By byIndex(String tag, int index) {
        return By.xpath("(//" + tag + ")[" + index + "]");
    }

    /**
     * Locate a menu option using dynamic CSS selector.
     * Demonstrates CSS partial matching.
     */
    public static By menuOption(String option) {
        return By.cssSelector("a[href*='" + option.toLowerCase() + "']");
    }

    /**
     * Build a flexible locator for buttons with dynamic labels.
     * Works even when button text changes slightly.
     */
    public static By dynamicButton(String partialLabel) {
        return By.xpath("//button[contains(text(),'" + partialLabel + "')]");
    }
}
