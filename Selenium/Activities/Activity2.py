
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
import time

# Launch Chrome using driver manager
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
driver.get("https://training-support.net/webelements/login-form")

print("Page title is:", driver.title)
username = driver.find_element(By.ID, "username")

password = driver.find_element(By.ID, "password")

username.send_keys("admin")
password.send_keys("password")
login = driver.find_element(By.XPATH, "//button[text()='Submit']")
login.click()

message = driver.find_element(By.CSS_SELECTOR, "h1.text-center")
print("Login message: ", message.text)

time.sleep(3)

driver.quit()