package aletca;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ListenerTest {


    @Test
    public void testListenerTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());

        Configuration.browserSize = "1920x1080";
        open("https://github.com/Aletcas");
        $("[data-tab-item='repositories']").click();
        $(By.linkText("qa_guru_11_7")).click();
        $("[data-content='Issues']").shouldHave(text("Issues"));
    }
}
