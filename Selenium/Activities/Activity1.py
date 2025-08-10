from selenium import webdriver
from selenium.webdriver.common.by import By
import time

with  webdriver.Chrome() as driver:
    #navigate to URL
    driver.get("https://training-support.net/")

    #print the title of the page
    print("Page title is:", driver.title)

    # Find the "About Us" button on the page using ID and click it
    driver.find_element(By.LINK_TEXT, "About Us").click()

    time.sleep(2)  
    # Print the title of the new page
    print("New page title is: ", driver.title)

    #quit the browser
    driver.quit()