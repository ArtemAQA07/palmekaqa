package pages;

import config.TestData;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public void login(){
        open("https://palmekaprocode.ru/practice/text-box");
        $(byText("Понятно")).click(); // закрываем куки
        $("input[name='email']").click();
        $("input[name='email']").setValue(TestData.LOGEMAIL);
        $("input[name='password']").click();
        $("input[name='password']").setValue(TestData.PASSWORD);
        $("button[type='submit']").click();
    }
}
