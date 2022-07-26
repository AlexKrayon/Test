package com.sites.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SAPKVKK extends BasePage{

    @FindBy(xpath = "//p[contains(text(),'Melasoft GDPR-KVKK ile')]")
    public WebElement text_melasoftGDPRKVKKileKisiselVerilerinKorunmasi;

    @FindBy(xpath = "//span[contains(text(),'HEMEN BAŞLA')]")
    public WebElement hemenBaslaButton;

    @FindBy(xpath = "//h3[contains(text(),'İletişim Bilgileri')]")
    public WebElement text_iletisimBilgileri;

    @FindBy(xpath = "//span[contains(text(),'Daha Fazla Bilgi İçin')]")
    public WebElement dahaFazlaBilgiIcinButton;

    @FindBy(xpath = "//h2[contains(text(),'GDPR – KVKK')]")
    public WebElement text_GDPRKVKK;

    @FindBy(xpath = "//span[contains(text(),'Melasoft e-Açık Rıza Sistemi')]")
    public WebElement melasoftEAcikRizaSistemiButton;

    @FindBy(xpath = "//span[contains(text(),'KVKK’nın 3’üncü maddesine göre açık rıza “belirli ')]")
    public WebElement text_kvkknin3uncuMaddesineGore;

    @FindBy(xpath = "(//a[@class='fl-button'])[3]")
    public WebElement sssButton_down;

    @FindBy(xpath = "(//a[contains(text(),'Kişisel Verilerin Korunması Ne Demektir?')])[1]")
    public WebElement text_kisiselVerilerinKorunmasi;

    @FindBy(xpath = "(//a[normalize-space()='BLOG'])[1]")
    public WebElement blogButton;

    @FindBy(xpath = "//h4[contains(text(),'Kişisel Verilerin İşlenmesi')]")
    public WebElement text_kisiselVerilerinIslenmesi;

    @FindBy(xpath = "(//a[normalize-space()='SSS'])[1]")
    public WebElement sssButton_up;

}
