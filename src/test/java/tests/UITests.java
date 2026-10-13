package tests;

import config.TestData;
import org.junit.jupiter.api.DisplayName;
import pages.HomePage;
import pages.LoginPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class UITests extends TestBase {
    private final LoginPage loginPage = new LoginPage();
    private final HomePage homePage = new HomePage();

    @Test
    @DisplayName("Проверка раздела Элементы: 'Текстовые поля'")
    public void textBoxTest() {
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        homePage.openTextBox();
        homePage.inputFullName(TestData.FULLNAME);
        homePage.inputEmail(TestData.EMAIL);
        homePage.inputCurrentAddress(TestData.CURRENTADDRESS);
        homePage.inputPermanentAddress(TestData.PARMANENTADDRESS);
        homePage.pressButtonSubmit();
        homePage.checkFullName(TestData.FULLNAME);
        homePage.checkEmail(TestData.EMAIL);
        homePage.checkCurrentAddress(TestData.CURRENTADDRESS);
        homePage.checkPermanentAddress(TestData.PARMANENTADDRESS);
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Чекбоксы'")
    public void checkBoxTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        homePage.openCheckBox();
        homePage.checkHomeButton();
        homePage.checkDesktopButton();
        homePage.checkNotesButton();
        homePage.checkCommandsButton();
        homePage.checkDocumentsButton();
        homePage.checkWorkspaceButton();
        homePage.checkDownloadsButton();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Радиокнопки'")
    public void radioButtonsTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openRadioButtons();
        homePage.clickYesRadioButton();
        homePage.clickImpressiveRadioButton();
        homePage.negativeCheckNoRadioButton();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Веб-таблицы'")
    public void webTablesTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openWebTables();
        homePage.tableSearchTest(TestData.TABLEDATA);
        homePage.tableChangeTest(TestData.TABLEDATA,TestData.TABLECHANGEDDATA);
        homePage.addRecordTest();
        homePage.addNameInTable(TestData.NAMEINTABLE);
        homePage.addEmailInTable(TestData.EMAILINTABLE);
        homePage.addSalaryInTable(TestData.SALARYINTABLE);
        homePage.addLastNameInTable(TestData.LASTNAMEINTABLE);
        homePage.addAgeInTable(TestData.AGEINTABLE);
        homePage.addDepartmentInTable(TestData.DEPARTMENTINTABLE);
        homePage.checkTable(TestData.NAMEINTABLE,TestData.EMAILINTABLE,TestData.SALARYINTABLE,TestData.LASTNAMEINTABLE,TestData.AGEINTABLE,TestData.DEPARTMENTINTABLE);
        homePage.deleteTable();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Кнопки'")
    public void buttonTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openButtons();
        homePage.doubleClickTest();
        homePage.rightClickTest();
        homePage.normalClickTest();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Ссылки'")
    public void linksTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openLinks();
        homePage.openLinksInNewTab();
        homePage.openLinksInThisTab();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Битые ссылки и изображения'")
    public void brokenLinksTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openBrokenLinks();
        homePage.checkValidImageIsVisible();
        homePage.openValidLinks();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openBrokenLinks();
        homePage.clickBrokenLinks();
        homePage.NegativeCheckBrokenImage();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Загрузка и скачивание'")
    public void uploadDownloadTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openUploadDownload();
        homePage.uploadFile(TestData.FILEPATH,TestData.FILENAME);
        homePage.downloadFile();
    }

    @Test
    @DisplayName("Проверка раздела Элементы: 'Динамические свойства'")
    public void dynamicPropertiesTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openDynamicProperties();
        homePage.enableButtonAfterTwoSeconds();
        homePage.dynamicСolorButton();
        homePage.buttonAppearedAfter5Seconds();

    }

    @Test
    @DisplayName("Проверка раздела Формы: 'Учебная форма'")
    public void practiceFormTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1100);");
        sleep(2000);
        homePage.openPracticeForm();
        homePage.inputNameInPracticeForm(TestData.NAMEINPRACTICEFORM);
        homePage.inputLastNameInPracticeForm(TestData.LASTNAMEINPRACTICEFORM);
        homePage.inputEmailInPracticeForm(TestData.EMAILINPRACTICEFORM);
        homePage.inputNumberInPracticeForm(TestData.NUMBERINPRACTICEFORM);
        homePage.sexInPracticeForm();
        homePage.inputBirthDateInPracticeForm(TestData.BIRTHDATEINPRACTICEFORM);
        homePage.inputSubjectsInPracticeForm(TestData.SUBJECTSINPRACTICEFORM);
        homePage.hobbiesInPracticeForm();
        homePage.uploadPhoto(TestData.PHOTO);
        homePage.inputAddressInPracticeForm(TestData.ADDRESSINPRACTICEFORM);
        homePage.regionInPracticeForm(TestData.REGIONINPRACTICEFORM);
        homePage.CityInPracticeForm(TestData.CITYINPRACTICEFORM);
        executeJavaScript("window.scrollBy(0, 1100);");
        homePage.submitStudentForm();
        homePage.checkSummaryTable();
    }

    @Test
    @DisplayName("Проверка раздела Окна и уведомления: 'Окна браузера'")
    public void browserWindowsTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openBrowserWindows();
        homePage.openNewTab();
        homePage.openNewWindow();
        homePage.openNewWindowMessage();
    }

    @Test
    @DisplayName("Проверка раздела Окна и уведомления: 'Уведомления'")
    public void alertsTest() {
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openAlerts();
        homePage.openAlertsNow();
        homePage.openAlertsAfter5Sec();
        homePage.openConfirm();
        homePage.openPrompt();
    }

    @Test
    @DisplayName("Проверка раздела Окна и уведомления: 'Фреймы'")
    public void frameTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openFrame();
        homePage.bigFrame();
        homePage.smallFrame();
    }

    @Test
    @DisplayName("Проверка раздела Окна и уведомления: 'Вложенные фреймы'")
    public void nestedFramesTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openNestedFrames();
        homePage.parentFrame();
        homePage.childFrame();
    }

    @Test
    @DisplayName("Проверка раздела Окна и уведомления: 'Модальные окна'")
    public void modalDialogsTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openModalDialogs();
        homePage.clickSmallWindow();
        homePage.clickLargeWindow();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Аккордеон'")
    public void accordionTest() {
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openAccordion();
        homePage.checkFirstAccordion();
        homePage.checkSecondAccordion();
        homePage.checkThirdAccordion();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Автодополнение'")
    public void AutoComplete(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openAutoComplete();
        homePage.addBlue();
        homePage.addSeveralColors();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Выбор даты'")
    public void datePickerTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openDatePicker();
        homePage.InputDateOnly();
        homePage.InputDateWithTime();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Слайдер'")
    public void sliderTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openSlider();
        homePage.changeSliderValue();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Прогресс-бар'")
    public void progressBarTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openProgressBar();
        homePage.testProgressBar();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Вкладки'")
    public void tabsTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openTabs();
        homePage.whatButtonClick();
        homePage.fromWhereButtonClick();
        homePage.benefitButtonClick();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Подсказки'")
    public void tooltipsTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openTooltips();
        homePage.checkTooltipOnButton();
        homePage.checkTooltipOnInput();
        homePage.checkTooltipOnText();
    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Меню'")
    public void menuTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openMenu();
        homePage.multiLevelMenu();
        homePage.menuWithKeyboard();

    }

    @Test
    @DisplayName("Проверка раздела Виджеты: 'Селекты'")
    public void selectMenuTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 650);");
        sleep(2000);
        homePage.openSelectMenu();
        homePage.selectValue(TestData.VALEUBYSELLECTMENU, TestData.RESULTVALEUBYSELLECTMENU);
        homePage.selectAllValue(TestData.VALEUBYSELLECTMENU, TestData.ROLEBYSELLECTMENU, TestData.COLORBYSELLECTMENU,TestData.RESULTVALEUBYSELLECTMENU,TestData.RESULTROLEBYSELLECTMENU,TestData.RESULTCOLORBYSELLECTMENU);
    }

    @Test
    @DisplayName("Проверка раздела Взаимодействия: 'Сортировка'")
    public void sortableTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openSortable();
        homePage.testSortable();
    }

    @Test
    @DisplayName("Проверка раздела Взаимодействия: 'Выбор элементов'")
    public void selectableTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openSelectable();
        homePage.selectOneBlocks();
        homePage.selectSeveralBlocks();
    }

    @Test
    @DisplayName("Проверка раздела Взаимодействия: 'Изменение размера'")
    public void resizableTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openResizable();
        homePage.resizeLimitedBox();
        homePage.resizeFreeBox();
    }

    @Test
    @DisplayName("Проверка раздела Взаимодействия: 'Зона сброса'")
    public void droppableTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openDroppable();
        homePage.dropElement();
        homePage.resetDrop();
    }

    @Test
    @DisplayName("Проверка раздела Взаимодействия: 'Перетаскивание'")
    public void draggableTest(){
        loginPage.login();
        sleep(1000);
        homePage.openPracticeNav();
        executeJavaScript("window.scrollBy(0, 1700);");
        sleep(2000);
        homePage.openDraggable();
        homePage.testDragBox();

    }
}