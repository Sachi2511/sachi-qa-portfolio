package Practice.utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

@DataProvider(name = "loginData")
public Object[][] getLoginData() {
    return new Object[][]{
            {"standard_user", "secret_sauce", "Products"},
            {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
            {"problem_user", "secret_sauce", "Products"}
    };
}
}

