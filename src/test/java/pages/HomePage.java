package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.numberOfWindows;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    private final SelenideElement
    fullname = $("input[id='full-name']"),
    useremail = $("input[id='user-email']"),
    currentaddress = $("textarea[id='current-address']"),
    permanentaddress = $("textarea[id='permanent-address']"),
    opentextbox = $("a[id='tool-text-box']"),
    openpracticenav = $(".practice-nav-link"),
    submitbutton = $("button[id='submit-text-box']"),
    correctname = $x("//div[@id='text-box-output']//p[b[text()='Имя:']]"),
    correctemail = $x("//div[@id='text-box-output']//p[b[text()='Почта:']]"),
    correctcurrentaddress = $x("//div[@id='text-box-output']//p[b[text()='Текущий адрес:']]"),
    correctpermanentaddress = $x("//div[@id='text-box-output']//p[b[text()='Адрес регистрации:']]"),
    opencheckbox = $("a[id='tool-check-box']"),
    openradiobuttons = $x("//a[@id='tool-radio-button']"),
    radioyesbutton = $("input[id='radio-yes']"),
    impressivebutton = $("input[id='radio-impressive']"),
    radionobutton = $("input[id='radio-no']"),
    homebutton = $("input[id='check-home']"),
    desktopbutton = $("input[id='check-desktop']"),
    notesbutton = $("input[id='check-notes']"),
    commandsbutton = $("input[id='check-commands']"),
    documentsbutton = $("input[id='check-documents']"),
    workspacebutton = $("input[id='check-workspace']"),
    downloadsbutton = $("input[id='check-downloads']"),
    openwebtables = $("a[id='tool-web-tables']"),
    tablesearch = $("input[id='table-search']"),
    addrecordbutton = $("button[id='add-record']"),
    openbuttons = $x("//a[@id='tool-buttons']"),
    openllinks = $x("//a[@id='tool-links']");

    @Step("Открыть Тренировочное поле")
    public void openPracticeNav(){
        openpracticenav.click();
        sleep(3000);
    }

    @Step("Открыть Text-Box")
    public void openTextBox(){
        opentextbox.click();
    }

    @Step("Ввод Имени и фамилии")
    public void inputFullName(String name){
        fullname.setValue(name);
    }

    @Step("Ввод email")
    public void inputEmail(String email){
        useremail.setValue(email);
    }

    @Step("Ввод Текущего Адреса")
    public void inputCurrentAddress(String address){
        currentaddress.setValue(address);
    }

    @Step("Ввод Адреса Регистрации")
    public void inputPermanentAddress(String address){
        permanentaddress.setValue(address);
    }

    @Step("Нжать кнопку отправить")
    public void pressButtonSubmit(){
        submitbutton.click();
    }

    @Step("Проверка Имени и фамилии")
    public void checkFullName(String name){
        correctname.shouldHave(text(name));
    }

    @Step("Проверка email")
    public void checkEmail(String name){
        correctemail.shouldHave(text(name));
    }

    @Step("Проверка Текущего Адреса")
    public void checkCurrentAddress(String name){
        correctcurrentaddress.shouldHave(text(name));
    }

    @Step("Проверка Адреса Регистрации")
    public void checkPermanentAddress(String name){
        correctpermanentaddress.shouldHave(text(name));
    }

    @Step("Открыть Check-Box")
    public void openCheckBox(){
        opencheckbox.click();
    }

    @Step("Проверка кнопки 'Домой' ")
    public void checkHomeButton(){
        homebutton.click();
        $("div[id='check-box-result']").shouldHave(text("Рабочий стол, Заметки, Команды, Документы, Проекты, Загрузки"));
        homebutton.click();
    }

    @Step("Проверка кнопки 'Рабочий стол'")
    public void checkDesktopButton(){
        desktopbutton.click();
        $("div[id='check-box-result']").shouldHave(text("Рабочий стол, Заметки, Команды"));
        desktopbutton.click();
    }

    @Step("Проверка кнопки 'Заметки'")
    public void checkNotesButton(){
        notesbutton.click();
        $("div[id='check-box-result']").shouldHave(text("Заметки"));
        notesbutton.click();
    }

    @Step("Проверка кнопки 'Команды'")
    public void checkCommandsButton(){
        commandsbutton.click();
        $("div[id='check-box-result']").shouldHave(text("Команды"));
        commandsbutton.click();
    }

    @Step("Проверка кнопки 'Документы'")
    public void checkDocumentsButton(){
        documentsbutton.click();
        $("div[id='check-box-result']").shouldHave(text("Документы, Проекты"));
        documentsbutton.click();
    }

    @Step("Проверка кнопки 'Проекты'")
    public void checkWorkspaceButton(){
        workspacebutton.click();
        $("div[id='check-box-result']").shouldHave(text("Документы, Проекты"));
        workspacebutton.click();
    }

    @Step("Проверка кнопки 'Загрузки'")
    public void checkDownloadsButton(){
        downloadsbutton.click();
        $("div[id='check-box-result']").shouldHave(text("Загрузки"));
        downloadsbutton.click();
    }

    @Step("Открыть Радиокнопки")
    public void openRadioButtons(){
        sleep(2000);
        openradiobuttons.click();
    }

    @Step("Нажать кнопку 'Да'")
    public void clickYesRadioButton(){
        radioyesbutton.click();
        $("div[id='radio-result']").shouldHave(text("Да"));
    }

    @Step("Нажать кнопку 'Впечатляет'")
    public void clickImpressiveRadioButton(){
        impressivebutton.click();
        $("div[id='radio-result']").shouldHave(text("Впечатляет"));
    }

    @Step("Проверит кнопку 'нет'")
    public void clickNoRadioButton() {
        radionobutton.click();
    }

    @Step("Открыть web-tables")
    public void openWebTables(){
        openwebtables.click();
    }

    @Step("Проверка поиска по таблице")
    public void tableSearchTest(String Data){
        tablesearch.setValue(Data);
        $("table[id='records-table']").shouldHave(text(Data));
        sleep(3000);
        tablesearch.click();
        actions()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
    }

    @Step("Проверка изменения зарплаты в Таблице")
    public void tableChangeTest(String Data, String Salary) {
        tablesearch.setValue(Data);
        $("table[id='records-table']").shouldHave(text(Data));
        sleep(3000);
        $("button[id='edit-record-1']").click();
        sleep(2000);
        $("input[id='record-salary']").click();
        actions()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
        $("input[id='record-salary']").setValue(Salary);
        $("button[id='save-record']").click();
        tablesearch.setValue(Data);
        $("table[id='records-table']").shouldHave(text(Salary));
        actions()
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.BACK_SPACE)
                .perform();
    }

    @Step("Проверка кнопки 'Добавить запись' ")
    public void addRecordTest(){
        addrecordbutton.click();
    }

    @Step("Добавить имя в Таблицу")
    public void addNameInTable(String Data){
        $("input[id='record-first-name'").setValue(Data);
    }

    @Step("Добавить почту в Таблицу")
    public void addEmailInTable(String Data){
        $("input[id='record-email'").setValue(Data);
    }

    @Step("Добавить Зарплату в Таблицу")
    public void addSalaryInTable(String Data){
        $("input[id='record-salary'").setValue(Data);
    }

    @Step("Добавить Фамилию в Таблицу")
    public void addLastNameInTable(String Data){
        $("input[id='record-last-name'").setValue(Data);
    }

    @Step("Добавить Возраст в Таблицу")
    public void addAgeInTable(String Data){
        $("input[id='record-age'").setValue(Data);
    }

    @Step("Добавить отдел в Таблицу")
    public void addDepartmentInTable(String Data){
        $("input[id='record-department'").setValue(Data);
    }

    @Step("Проверка что данные в Таблице добавились корректно")
    public void checkTable(String Name,String Email,String Salary,String LastName,String Age,String Department){
        $("button[id='save-record']").click();
        $("tr[id='record-4'").shouldHave(text(Name));
        $("tr[id='record-4'").shouldHave(text(Email));
        $("tr[id='record-4'").shouldHave(text(Salary));
        $("tr[id='record-4'").shouldHave(text(LastName));
        $("tr[id='record-4'").shouldHave(text(Age));
        $("tr[id='record-4'").shouldHave(text(Department));
    }

    @Step("Проверка удаления Объекта из Таблицы")
    public void deleteTable(){
        $("button[id='delete-record-4']").click();
        sleep(4000);
    }

    @Step("Открыть Кнопки")
    public void openButtons(){
        openbuttons.click();
        sleep(5000);
    }

    @Step("Проверка двойного клика")
    public void doubleClickTest(){
        $("button[id='double-click']").doubleClick();
        $("div[id='button-result']").shouldHave(text("Выполнен двойной клик"));
    }

    @Step("Проверка двойного клика")
    public void rightClickTest(){
        $("button[id='right-click']").contextClick();
        $("div[id='button-result']").shouldHave(text("Выполнен двойной клик")).shouldHave(text("Выполнен правый клик"));
    }

    @Step("Проверка Обычного клика")
    public void normalClickTest(){
        $("button[id='single-click']").click();
        $("div[id='button-result']").shouldHave(text("Выполнен двойной клик")).shouldHave(text("Выполнен правый клик")).shouldHave(text("Выполнен обычный клик"));
    }

    @Step("Открыть Ссылки")
    public void openLinks(){
        sleep(2000);
        openllinks.click();
    }

    @Step("Открыть Ссылки в новой вкладке")
    public void openLinksInNewTab(){
        sleep(2000);
        $("a[id='home-link']").click();
        Selenide.switchTo().window(1);
        webdriver().shouldHave(numberOfWindows(2));
        sleep(2000);
        Selenide.switchTo().window(0);
    }

    @Step("Открыть Ссылки в этой же вкладке")
    public void openLinksInThisTab(){
        String originalWindow = getWebDriver().getWindowHandle();
        sleep(2000);
        $("a[id='practice-link']").click();
        webdriver().shouldHave(url("https://palmekaprocode.ru/practice"));
        assert getWebDriver().getWindowHandle().equals(originalWindow);
    }

    @Step("Открыть Битые Ссылки")
    public void openBrokenLinks(){
        $("a[id='tool-broken-links']").click();
        sleep(2000);
    }

    @Step("Открыть Рабочую ссылку")
    public void openValidLinks(){
        $("a[id='valid-link']").click();
        sleep(2000);
        webdriver().shouldHave(url("https://palmekaprocode.ru/practice"));
    }

    @Step("Открыть Битую ссылку")
    public void clickBrokenLinks(){
        $("a[id='broken-link']").click();
        Selenide.switchTo().window(1);
        sleep(2000);
        $x("//h1[contains(text(), '404')]").shouldBe(visible);
        $x("//h2[contains(text(), 'This page could not be found.')]").shouldBe(visible);
        Selenide.switchTo().window(0);

    }

    @Step("Проверить, что картинка 'Рабочий учебный баннер' отображается")
    public void checkValidImageIsVisible(){
        $("img[id='valid-image']").shouldBe(visible);
    }

    @Step("Проверить Битое изображение")
    public void checkBrokenImage(){
        $("img[id='broken-image']").shouldBe(visible);
    }

    @Step("Открыть Битые Ссылки")
    public void openUploadDownload(){
        $("a[id='tool-upload-download']").click();
    }

    @Step("Загрузить файл через input")
    public void uploadFile(String filePath, String FileName){
        File file = new File(filePath);
        $("input[id='upload-file']").uploadFile(file);
        sleep(2000);
        $("p[id='uploaded-file-name']").shouldHave(text(FileName));
    }

    @Step("Скачать тестовый файл")
    public void downloadFile(){
        $("a[id='download-file']").click();
    }

    @Step("Открыть Динамические свойства")
    public void openDynamicProperties(){
        $("a[id='tool-dynamic-properties']").click();
    }

    @Step("Кнопка Станет доступна через 2 секунды")
    public void enableButtonAfterTwoSeconds(){
        $("#enable-after").shouldBe(disabled).shouldHave(text("Станет доступна через 2 секунды"));
        $("#enable-after").shouldBe(enabled, java.time.Duration.ofSeconds(2));
        $("#enable-after").shouldHave(text("Кнопка доступна"));
    }

    @Step("Кнопка Изменит цвет через 3,5 секунды")
    public void dynamicСolorButton(){
        $("#color-change").shouldHave(cssClass("button-light")).shouldNotHave(cssClass("dynamic-color"));
        $("#color-change").shouldHave(cssClass("dynamic-color"), java.time.Duration.ofSeconds(4));
    }

    @Step("Кнопка Появилась через 5 секунд")
    public void buttonAppearedAfter5Seconds(){
        $("#visible-after").shouldNotBe(visible).shouldNot(exist);
        $("#visible-after").shouldBe(visible, Duration.ofSeconds(5));
        $("#visible-after").shouldHave(text("Появилась через 5 секунд"));


    }

    @Step ("Открыть Учебную форму")
    public void openPracticeForm(){
        $("#tool-practice-form").click();
    }

    @Step("Ввести имя в Учебной форме")
    public void inputNameInPracticeForm(String Name){
       $("#first-name").setValue(Name);
    }

    @Step("Ввести фамилию в Учебной форме")
    public void inputLastNameInPracticeForm(String LastName){
        $("#last-name").setValue(LastName);
    }

    @Step("Ввести email в Учебной форме")
    public void inputEmailInPracticeForm(String Email){
        $("#student-email").setValue(Email);
    }

    @Step("Ввести Телефон в Учебной форме")
    public void inputNumberInPracticeForm(String Number){
        $("#mobile-number").setValue(Number);
    }

    @Step("Выбрать пол в Учебной форме")
    public void sexInPracticeForm(){
        $("#gender-male").click();
    }

    @Step("Ввести Дату Рождения в Учебной форме")
    public void inputBirthDateInPracticeForm(String Date){
        $("#birth-date").setValue(Date);
    }

    @Step("Ввести предметы в Учебной форме")
    public void inputSubjectsInPracticeForm(String Subjects){
        $("#subjects").setValue(Subjects);
    }

    @Step("Выбрать Увлечения в Учебной форме")
    public void hobbiesInPracticeForm(){
        $("#hobby-sports").click();
        $("#hobby-music").click();
    }

    @Step("Загрузить Фото")
    public void uploadPhoto(String filePath){
        File file = new File(filePath);
        $("#student-picture").uploadFile(file);
        sleep(2000);
    }

    @Step("Ввести Адрес в Учебной форме")
    public void inputAddressInPracticeForm(String Address){
        $("#student-address").setValue(Address);
    }

    @Step("Выбрать Регион в Учебной форме")
    public void regionInPracticeForm(String Region){
        $("#region").selectOption(Region);
    }

    @Step("Выбрать Регион в Учебной форме")
    public void CityInPracticeForm(String City){
        $("#city").selectOption(City);
    }

    @Step("Нажимаем отправить форму")
    public void submitStudentForm(){
        $("#submit-student-form").click();
    }

    @Step("Проверка, что все данные заполнены")
    public void checkSummaryTable(){
        $("#student-summary-title").shouldHave(text("Отправленные данные"));
    }
    @Step("Открыть Окна Браузера")
    public void openBrowserWindows(){
        $("#tool-browser-windows").click();
    }

    @Step("Открыть новую вкладку")
    public void openNewTab(){
        $("#new-tab").click();
        Selenide.switchTo().window(1);
        $("h1").shouldHave(text("Новая вкладка"));
        $("b").shouldHave(text("ЗАКРЫТАЯ ШКОЛА ТЕСТИРОВАНИЯ"));
        $("p").shouldHave(text("Это отдельная страница для проверки переключения вкладок."));
        Selenide.switchTo().window(0);
    }

    @Step("Открыть новое окно")
    public void openNewWindow(){
        $("#new-window").click();
        Selenide.switchTo().window(2);
        $("h1").shouldHave(text("Новое окно"));
        $("b").shouldHave(text("ЗАКРЫТАЯ ШКОЛА ТЕСТИРОВАНИЯ"));
        $("p").shouldHave(text("Проверьте размер, заголовок и возврат в исходное окно."));
        Selenide.switchTo().window(0);
    }

    @Step("Открыть сообщение")
    public void openNewWindowMessage(){
        $("#new-window-message").click();
        Selenide.switchTo().window(3);
        $("h1").shouldHave(text("Учебное сообщение"));
        $("b").shouldHave(text("ЗАКРЫТАЯ ШКОЛА ТЕСТИРОВАНИЯ"));
        $("p").shouldHave(text("Автотест должен найти этот текст в новом контексте браузера."));
    }

    @Step("Открыть Уведомления")
    public void openAlerts(){
        $("#tool-alerts").click();
    }

    @Step("Открыть Alert")
    public void openAlertsNow(){
        $("#alert-button").click();
        Selenide.switchTo().alert().accept();
    }

    @Step("Открыть Alert через 5 сек")
    public void openAlertsAfter5Sec(){
        $("#timer-alert-button").click();
        sleep(5000);
        Selenide.switchTo().alert().accept();
    }

    @Step("Открыть Показать confirm")
    public void openConfirm(){
        $("#confirm-button").click();
        Selenide.switchTo().alert().accept();
        $("#alert-result").shouldHave(text("Нажата кнопка ОК"));
        $("#confirm-button").click();
        Selenide.switchTo().alert().dismiss();
        $("#alert-result").shouldHave(text("Нажата кнопка Отмена"));
    }

    @Step("Открыть Показать prompt")
    public void openPrompt(){
        $("#prompt-button").click();
        Selenide.switchTo().alert().sendKeys("QA Engineer");
        $("#alert-result").shouldHave(text("QA Engineer"));
    }

    @Step("Открыть Фреймы")
    public void openFrame(){
        $("#tool-frames").click();
    }

    @Step("Найти Большой Фрейм")
    public void bigFrame(){
        Selenide.switchTo().frame("frame-one");
        $("#frame-heading").shouldHave(text("Первый фрейм"));
        Selenide.switchTo().defaultContent();
    }

    @Step("Найти Маленький Фрейм")
    public void smallFrame(){
        Selenide.switchTo().frame("frame-two");
        $("#frame-text").shouldHave(text("Второй фрейм"));
        Selenide.switchTo().defaultContent();
    }

    @Step("Открыть Вложенные фреймы")
    public void openNestedFrames(){
        $("#tool-nested-frames").click();
    }

    @Step("Найти Родительский Фрейм")
    public void parentFrame(){
        Selenide.switchTo().frame("parent-frame");
        $("#parent-frame-text").shouldHave(text("Родительский фрейм"));
        Selenide.switchTo().defaultContent();
    }

    @Step("Найти Дочерний Фрейм")
    public void childFrame(){
        Selenide.switchTo().frame("parent-frame");
        $("#parent-frame-text").shouldHave(text("Родительский фрейм"));
        Selenide.switchTo().frame("child-frame");
        $("#child-frame-text").shouldHave(text("Дочерний фрейм"));
    }

    @Step("Открыть Модальные окна")
    public void openModalDialogs(){
        $("#tool-modal-dialogs").click();
    }

    @Step("Нажать на кнопку Маленькое окно")
    public void clickSmallWindow(){
        $("#small-modal").click();
        $("#small-modal-dialog").shouldBe(visible).$("p").shouldHave(text("Короткий текст для проверки открытия и закрытия."));
        $("#small-modal-dialog").$("button.button-primary").click();
        $("#small-modal-dialog").shouldNotBe(visible);
    }

    @Step("Нажать на кнопку Большое окно")
    public void clickLargeWindow(){
        $("#large-modal").click();
        $("#large-modal-dialog").shouldBe(visible).$("#large-modal-dialog-title").shouldHave(text("Большое модальное окно"));
        $("#large-modal-dialog").$("section > p").shouldHave(text("В этом окне больше текста. Проверьте заголовок, содержимое, фокус, кнопку закрытия и исчезновение подложки после действия. Модалка остается читаемой на телефоне и не выходит за границы экрана."));
        $("#large-modal-dialog").$("button.button-primary").click();
        $("#large-modal-dialog").shouldNotBe(visible);
    }

    @Step("Открыть Аккордеон")
    public void openAccordion(){
        $("#tool-accordion").click();
    }

    @Step("Проверка первого Аккордеона")
    public void checkFirstAccordion(){
        $("#accordion-quality").shouldHave(text("Что такое качество?"));
        $("#accordion-panel-quality").shouldBe(visible).$("p").shouldHave(text("Качество показывает, насколько продукт решает задачи пользователя и соответствует согласованным требованиям."));
    }

    @Step("Проверка второго Аккордеона")
    public void checkSecondAccordion(){
        $("#accordion-testing").click();
        $("#accordion-testing").shouldHave(text("Зачем нужно тестирование?"));
        $("#accordion-panel-testing").shouldBe(visible).$("p").shouldHave(text("Тестирование дает команде информацию о рисках, дефектах и готовности продукта к использованию."));
    }

    @Step("Проверка третьего Аккордеона")
    public void checkThirdAccordion(){
        $("#accordion-automation").click();
        $("#accordion-automation").shouldHave(text("Когда нужна автоматизация?"));
        $("#accordion-panel-automation").shouldBe(visible).$("p").shouldHave(text("Автоматизация полезна для частых, стабильных и повторяемых проверок с понятным ожидаемым результатом."));
    }

    @Step("Открыть Автодополнение")
    public void openAutoComplete(){
        $("#tool-auto-complete").click();
    }

    @Step("Добавить синий цвет")
    public void addBlue(){
        $("#auto-complete-input").setValue("с");
        $("#color-suggestions").shouldBe(visible).shouldHave(text("Синий"));
        $("#color-suggestions").$(byText("Синий")).click();
        $("#color-tags").$x(".//span[text()='Синий']").shouldBe(visible);
        $("button[aria-label='Удалить Синий']").click();
    }

    @Step("Добавить Несколько цветов")
    public void addSeveralColors(){
        $("#auto-complete-input").setValue("с");
        $("#color-suggestions").shouldBe(visible).shouldHave(text("Синий"));
        $("#color-suggestions").$(byText("Синий")).click();
        $("#color-tags").$x(".//span[text()='Синий']").shouldBe(visible);
        $("#auto-complete-input").setValue("к");
        $("#color-suggestions").shouldBe(visible).shouldHave(text("Красный"));
        $("#color-suggestions").$(byText("Красный")).click();
        $("#color-tags").$x(".//span[text()='Красный']").shouldBe(visible);
        $("#auto-complete-input").setValue("б");
        $("#color-suggestions").shouldBe(visible).shouldHave(text("Белый"));
        $("#color-suggestions").$(byText("Белый")).click();
        $("#color-tags").$x(".//span[text()='Белый']").shouldBe(visible);
    }

    @Step("Открыть Выбор даты")
    public void openDatePicker(){
        $("#tool-date-picker").click();
    }

    @Step("Ввести только дату")
    public void InputDateOnly(){
        $("#date-only").setValue("07102026");
        $("#date-result").shouldHave(text("Дата: 2026-10-07"));
    }

    @Step("Ввести дату со временем")
    public void InputDateWithTime(){
        $("#date-time").setValue("07101120261515");
        $("#date-result").shouldHave(text("Дата и время: 112026-10-07T15:15"));
    }

    @Step("Открыть Слайдер")
    public void openSlider(){
        $("#tool-slider").click();
    }

    @Step("Перетащить ползунок")
    public void changeSliderValue(){
        $("#range-slider").shouldBe(visible);
        Selenide.executeJavaScript("const slider = arguments[0];" + "const nativeInputValueSetter = Object.getOwnPropertyDescriptor(window.HTMLInputElement.prototype, 'value').set;" + "nativeInputValueSetter.call(slider, '67');" + "slider.dispatchEvent(new Event('input', { bubbles: true }));" + "slider.dispatchEvent(new Event('change', { bubbles: true }));", $("#range-slider"));
        $("#slider-value").shouldHave(text("67"));
    }

    @Step("Открыть Прогресс-бар")
    public void openProgressBar(){
        $("#tool-progress-bar").click();
    }

    @Step("Запустить прогресс, дождаться, остановить и сбросить")
    public void testProgressBar(){
        SelenideElement progressBar = $("#progress-bar");
        SelenideElement startBtn = $("#start-progress");
        SelenideElement resetBtn = $("#reset-progress");
        JavascriptExecutor js = (JavascriptExecutor) WebDriverRunner.getWebDriver();
        progressBar.shouldHave(Condition.attribute("aria-valuenow", "0"));
        startBtn.click();
        int caughtValue = -1;
        long timeout = System.currentTimeMillis() + 20_000;
        while (System.currentTimeMillis() < timeout) {
            Object raw = js.executeScript(
                    "return document.getElementById('progress-bar').getAttribute('aria-valuenow');"
            );
            if (raw != null) {
                int value = Integer.parseInt(raw.toString());
                if (value >= 67) {
                    startBtn.click();
                    caughtValue = value;
                    break;
                }
            }
            Selenide.sleep(30);
        }
        assertTrue(caughtValue >= 67,
                "Не удалось остановить прогресс на 67%. Дошли до: " + caughtValue);
        System.out.println("Прогресс остановлен на значении: " + caughtValue);
        String valueAfterStop = progressBar.getAttribute("aria-valuenow");
        Selenide.sleep(1500);
        String valueAfterWait = progressBar.getAttribute("aria-valuenow");
        assertEquals(valueAfterStop, valueAfterWait, "Прогресс не остановился! Было: " + valueAfterStop + ", стало: " + valueAfterWait);
        resetBtn.click();
        progressBar.shouldHave(Condition.attribute("aria-valuenow", "0"));
        progressBar.shouldHave(Condition.text("0%"));
    }

    @Step("Открыть Вкладки")
    public void openTabs(){
        $("#tool-tabs").click();
    }

    @Step("Нажать кнопку ЧТО")
    public void whatButtonClick(){
        $("#tab-what").click();
        $("#tab-panel-what").$("p").shouldHave(text("Тестирование исследует продукт и сравнивает фактическое поведение с ожидаемым."));
    }

    @Step("Нажать кнопку ОТКУДА")
    public void fromWhereButtonClick(){
        $("#tab-origin").click();
        $("#tab-panel-origin").$("p").shouldHave(text("Ожидаемый результат берется из требований, договоренностей, стандартов и потребностей пользователя."));
    }

    @Step("Нажать кнопку ПОЛЬЗА")
    public void benefitButtonClick(){
        $("#tab-use").click();
        $("#tab-panel-use").$("p").shouldHave(text("Хорошая проверка снижает неопределенность и помогает принять решение о выпуске продукта."));
    }

    @Step("Открыть Подсказки")
    public void openTooltips(){
        $("#tool-tooltips").click();
    }

    @Step("Наводим мышку на кнопку и проверяем появилась ли подсказка")
    public void checkTooltipOnButton(){
        $("#tooltip-button").hover();
        $("#tooltip-button").parent().shouldHave(attribute("data-tip", "Подсказка у кнопки"));
    }

    @Step("Наводим мышку на строку ввода и проверяем появилась ли подсказка")
    public void checkTooltipOnInput(){
        $("#tooltip-input").hover();
        $("#tooltip-input").parent().shouldHave(attribute("data-tip", "Подсказка у поля"));
    }

    @Step("Наводим мышку на текст и проверяем появилась ли подсказка")
    public void checkTooltipOnText(){
        $("#tooltip-text").hover();
        $("#tooltip-text").shouldHave(attribute("data-tip", "Подсказка у текста"));
    }

    @Step("Открыть Меню")
    public void openMenu(){
        $("#tool-menu").click();
    }

    @Step("Пройти по многоуровневому меню до пункта 'iOS'")
    public void multiLevelMenu(){
        $("#menu-products").hover();
        $("#menu-mobile").shouldBe(visible).hover();
        $("#menu-ios").shouldBe(visible).hover();
        $("#menu-ios").shouldHave(text("iOS"));
        $("#menu-ios").click();
        executeJavaScript("window.scrollBy(650,0);");
    }

    @Step("Пройти по меню с клавиатуры")
    public void menuWithKeyboard() {
        $("#menu-home").pressTab();
        $("#menu-products").pressTab();
        $("#menu-web").shouldBe(visible);
        $("#menu-mobile").pressTab();
        $("#menu-ios").shouldBe(visible);
        $("#menu-ios").click();
    }

    @Step("Открыть Селекты")
    public void openSelectMenu(){
        $("#tool-select-menu").click();
    }

    @Step("Выбрать Значение")
    public void selectValue(String value, String result){
        $("#select-value").selectOption(value);
        $("#select-result").shouldHave(text(result));
    }

    @Step("Выбрать все Значения")
    public void selectAllValue(String value,String role,String colors, String result1, String result2, String result3){
        $("#select-value").selectOption(value);
        $("#select-role").selectOption(role);
        $("#select-colors").selectOption(colors);
        $("#select-result").shouldHave(text(result1));
        $("#select-result").shouldHave(text(result2));
        $("#select-result").shouldHave(text(result3));
    }

    @Step("Открыть Сортировка")
    public void openSortable(){
        $("#tool-sortable").click();
    }

    @Step("Отсортировать элементы в порядок: Шесть - Пять - Четыре - Три - Один - Два")
    public void testSortable() {
        for (int i = 0; i < 5; i++) {
            $("button[aria-label='Опустить Один']").click();
        }
        for (int i = 0; i < 4; i++) {
            $("button[aria-label='Опустить Два']").click();
        }
        for (int i = 0; i < 3; i++) {
            $("button[aria-label='Опустить Три']").click();
        }
        for (int i = 0; i < 2; i++) {
            $("button[aria-label='Опустить Четыре']").click();
        }
        $("button[aria-label='Опустить Пять']").click();
        $("#sort-result")
                .$("p")
                .shouldHave(Condition.text("Шесть - Пять - Четыре - Три - Два - Один"));
    }

    @Step("Открыть Выбор элементов")
    public void openSelectable(){
        $("#tool-selectable").click();
    }

    @Step("Выбираем один блок")
    public void selectOneBlocks(){
        $("#selection-result").$("p").shouldHave(text("Ничего"));
        $("#selectable-2").click();
        $("#selectable-2").shouldHave(attribute("aria-pressed", "true"));
        $("#selection-result").$("p").shouldHave(text("2"));
        $("#selectable-2").click();
    }

    @Step("Выбираем несколько блоков")
    public void selectSeveralBlocks(){
        $("#selection-result").$("p").shouldHave(text("Ничего"));
        $("#selectable-1").click();
        $("#selectable-1").shouldHave(attribute("aria-pressed", "true"));
        $("#selectable-3").click();
        $("#selectable-3").shouldHave(attribute("aria-pressed", "true"));
        $("#selectable-5").click();
        $("#selectable-5").shouldHave(attribute("aria-pressed", "true"));
        $("#selection-result").$("p").shouldHave(text("1, 3, 5"));
    }

    @Step("Открыть Изменение размера")
    public void openResizable(){
        $("#tool-resizable").click();
    }

    @Step("Растянуть блок ограниченный контейнером")
    public void resizeLimitedBox(){
        SelenideElement box = $("#resize-box");
        box.shouldBe(visible);
        executeJavaScript("const box = document.getElementById('resize-box');" +
                        "box.style.width = '100px';" +
                        "box.style.height = '30px';" +
                        "box.dispatchEvent(new Event('resize', { bubbles: true }));");
        sleep(300);
        int startWidth = box.getSize().getWidth();
        int startHeight = box.getSize().getHeight();
        executeJavaScript("const box = document.getElementById('resize-box');" +
                        "box.style.width = '80%';" +
                        "box.style.height = '200px';" +
                        "box.dispatchEvent(new Event('resize', { bubbles: true }));");
        sleep(500);
        int newWidth = box.getSize().getWidth();
        int newHeight = box.getSize().getHeight();
        if (newWidth <= startWidth) {
            throw new AssertionError("Ширина не увеличилась: " + startWidth + " → " + newWidth);
        }
        if (newHeight <= startHeight) {
            throw new AssertionError("Высота не увеличилась: " + startHeight + " → " + newHeight);
        }
    }

    @Step("Растянуть блок со свободным изменением размера")
    public void resizeFreeBox() {
        SelenideElement box = $("#resize-box-free");
        box.shouldBe(visible);
        executeJavaScript("const box = document.getElementById('resize-box-free');" +
                        "box.style.width = '100px';" +
                        "box.style.height = '30px';" +
                        "box.dispatchEvent(new Event('resize', { bubbles: true }));");
        box.should(visible);
        sleep(300);
        int startWidth = box.getSize().getWidth();
        int startHeight = box.getSize().getHeight();
        executeJavaScript("const box = document.getElementById('resize-box-free');" +
                        "box.style.width = '400px';" +
                        "box.style.height = '200px';" +
                        "box.dispatchEvent(new Event('resize', { bubbles: true }));");
        sleep(300);
        int newWidth = box.getSize().getWidth();
        int newHeight = box.getSize().getHeight();
        if (newWidth <= startWidth) {
            throw new AssertionError("Ширина не увеличилась: " + startWidth + " → " + newWidth);
        }
        if (newHeight <= startHeight) {
            throw new AssertionError("Высота не увеличилась: " + startHeight + " → " + newHeight);
        }
    }

    @Step("Открыть Зона сброса")
    public void openDroppable(){
        $("#tool-droppable").click();
    }

    @Step("Перетаскиваем элемент в зону сброса")
    public void dropElement(){
        $("#drop-zone").shouldHave(text("Перетащите сюда"));
        $("#drop-zone").shouldNotHave(cssClass("dropped"));
        Selenide.executeJavaScript("const source = document.getElementById('drag-source');" +
                        "const target = document.getElementById('drop-zone');" +
                        "" +
                        "const dataTransfer = new DataTransfer();" +
                        "" +
                        "const dragStartEvent = new DragEvent('dragstart', { bubbles: true, dataTransfer: dataTransfer });" +
                        "source.dispatchEvent(dragStartEvent);" +
                        "" +
                        "const dragOverEvent = new DragEvent('dragover', { bubbles: true, dataTransfer: dataTransfer });" +
                        "target.dispatchEvent(dragOverEvent);" +
                        "" +
                        "const dropEvent = new DragEvent('drop', { bubbles: true, dataTransfer: dataTransfer });" +
                        "target.dispatchEvent(dropEvent);" +
                        "" +
                        "const dragEndEvent = new DragEvent('dragend', { bubbles: true, dataTransfer: dataTransfer });" +
                        "source.dispatchEvent(dragEndEvent);");
        $("#drop-zone").shouldHave(text("Элемент принят"));
        $("#drop-zone").shouldHave(cssClass("dropped"));
    }

    @Step("Нажимаем кнопку сброса")
    public void resetDrop(){
        $("#reset-drop").click();
        $("#drop-zone").shouldHave(text("Перетащите сюда"));
        $("#drop-zone").shouldNotHave(cssClass("dropped"));
    }

    @Step("Открыть Перетаскивание")
    public void openDraggable(){
        $("#tool-draggable").click();
    }

    @Step("Перетащить блок внутри рабочей области")
    public void testDragBox() {
        String startText = $("#drag-position").$("p").getText();
        new Actions(WebDriverRunner.getWebDriver()).clickAndHold($("#drag-box")).moveByOffset(100, 50).release().perform();
        $("#drag-position").$("p").shouldNotHave(Condition.text(startText));
    }
}
