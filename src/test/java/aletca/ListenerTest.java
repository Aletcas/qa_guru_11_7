package aletca;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ListenerTest {
    @Test
    public void testSearch() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("");



    }
}
