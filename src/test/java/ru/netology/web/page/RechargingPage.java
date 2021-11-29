package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class RechargingPage {
    private SelenideElement amountField = $("[data-test-id=\"amount\"] input");
    private SelenideElement fromField = $("[data-test-id=from] input");
    private SelenideElement toField = $("[data-test-id=to] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");
    private SelenideElement cancelButton = $("[data-test-id=action-cancel]");

    public void rechargeCard(DataHelper.CardInfo fromCardInfo) {
        String amountToAddForTest = "500";
        amountField.setValue(amountToAddForTest);
        fromField.setValue(fromCardInfo.getCardNumber());
        transferButton.click();
    }
}