package Peyk_Junit;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class PeykJenkins extends Driver {
    PEYK_Pages peyk_pages = new PEYK_Pages();
    @Test
    public void AnaSayfa() {

        BrowserUtils.waitFor(2);
        peyk_pages.anaSayfa.click();
        String anaSayfa = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(anaSayfa, "https://peyktest.kolaysoft.com.tr/accounting/peyk/hr-dashboard");
        BrowserUtils.waitFor(2);

        //Bordro
        peyk_pages.bordroGonder.click();
        BrowserUtils.waitFor(2);
        String bordroYukle = peyk_pages.ucretBordrosuYuk.getText();
        Assert.assertEquals(bordroYukle,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(3);

        //Form
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.formGonder.click();
        String formSablon = peyk_pages.sablonsuzGonderim.getText();
        Assert.assertEquals(formSablon,"Şablonsuz Gönderim");
        BrowserUtils.waitFor(2);

        //Taslak Hazırla
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.taslakHazırla.click();
        String form = peyk_pages.formuOnizle.getText();
        Assert.assertEquals(form,"Formu Önizle");
        BrowserUtils.waitFor(2);

        //Aylık Bildirimler-Bordro Arşiv
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.bordro.click();
        String ozlukBordrolar = peyk_pages.ozlukBordrolarArsiv.getText();
        Assert.assertEquals(ozlukBordrolar, "Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);

        //Aylık Bildirimler-Formlar Arşiv
        peyk_pages.anaSayfa.click();
        BrowserUtils.waitFor(2);
        peyk_pages.form.click();
        String formlar = peyk_pages.formlarArsiv.getText();
        Assert.assertEquals(formlar, "Formlar Arşiv");
        BrowserUtils.waitFor(2);
    }
    @Test
    public void OnayBekleyenler() {

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.anaSayfa);
        BrowserUtils.waitFor(2);

        peyk_pages.onayBekleyenler.click();
        String onayBek = peyk_pages.onayBekleyenler.getText();
        Assert.assertEquals(onayBek,"Onay Bekleyenler");
        BrowserUtils.waitFor(3);

    }
    @Test
    public void Peyk() {

        BrowserUtils.waitFor(2);
        String tanim = peyk_pages.tanimlar.getText();
        Assert.assertEquals(tanim,"Tanımlar");
        BrowserUtils.waitFor(2);

        //Tanımlar
        /*peyk_pages.tanimlar.click();
        BrowserUtils.waitFor(2);*/
        String departman = peyk_pages.departmanTanimi.getText();
        peyk_pages.departmanTanimi.isDisplayed();
        //Assert.assertEquals(departman,"Departman Tanımı");
        BrowserUtils.waitFor(2);

        //Departman Tanımı
        peyk_pages.departmanTanimi.click();
        BrowserUtils.waitFor(2);
        String departList = peyk_pages.departmanListesi.getText();
        Assert.assertEquals(departList,"Departman Listesi");
        BrowserUtils.waitFor(2);

        //Departman Tür Tanımı
        peyk_pages.departmanTurTanimi.click();
        BrowserUtils.waitFor(2);
        String depturu = peyk_pages.departmanTuru.getText();
        Assert.assertEquals(depturu,"Departman Türü Listesi");
        BrowserUtils.waitFor(2);

        //Çalışan Tanımları
        peyk_pages.calisanTanimlari.click();
        BrowserUtils.waitFor(2);
        String calisanlar = peyk_pages.calisanlar.getText();
        Assert.assertEquals(calisanlar,"Çalışanlar");
        BrowserUtils.waitFor(2);

        //Çalışanlar
        peyk_pages.calisanlar.click();
        BrowserUtils.waitFor(2);
        String calisanListesi = peyk_pages.calisanListesi.getText();
        Assert.assertEquals(calisanListesi,"Çalışan Listesi");
        BrowserUtils.waitFor(2);

        //Çalışan Şifre Yönetimi
        peyk_pages.calisanSifreYon.click();
        BrowserUtils.waitFor(2);
        String calisanSifreYonetimi = peyk_pages.calSifYon.getText();
        Assert.assertEquals(calisanSifreYonetimi,"Çalışan Şifre Yönetimi");
        BrowserUtils.waitFor(2);

        //Firma Bilgileri
        peyk_pages.firmaBilgileri.click();
        BrowserUtils.waitFor(2);
        String logoYukle = peyk_pages.logoYukle.getText();
        Assert.assertEquals(logoYukle,"Logo Yükle");
        BrowserUtils.waitFor(2);

        //Bilgilendirme Durumu
        peyk_pages.bilgilendirmeDurumu.click();
        BrowserUtils.waitFor(2);
        String calisanBilgilendirmeList = peyk_pages.calisanBilgilendirmeList.getText();
        Assert.assertEquals(calisanBilgilendirmeList,"Çalışan Listesi");
        BrowserUtils.waitFor(2);

        //Onay Akışı
        peyk_pages.onayAkisi.click();
        BrowserUtils.waitFor(2);
        String yeniOnayAkisi = peyk_pages.yeniOnayAkisi.getText();
        Assert.assertEquals(yeniOnayAkisi,"Yeni Oluştur");
        BrowserUtils.waitFor(2);

        //e-imza Doğrulama
        peyk_pages.eImzaDog.click();
        BrowserUtils.waitFor(2);
        String eImzaDogrulama = peyk_pages.AkilliKart.getText();
        Assert.assertEquals(eImzaDogrulama,"Akıllı kart markası");
        BrowserUtils.waitFor(2);

        //Form Tanımları
        peyk_pages.formTanimlari.click();
        BrowserUtils.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.ucretBordrosu);
        BrowserUtils.waitFor(2);
        String formSablonlari = peyk_pages.formSablonlari.getText();
        peyk_pages.formSablonlari.isDisplayed();
        //Assert.assertEquals(formSablonlari,"Form Şablonları");
        BrowserUtils.waitFor(2);

        //Form Şablonları
        peyk_pages.formTanimlari.click();
        peyk_pages.formSablonlari.click();
        BrowserUtils.waitFor(2);
        String formSablon = peyk_pages.formSablon.getText();
        Assert.assertEquals(formSablon,"Form Şablonları");
        BrowserUtils.waitFor(2);

        //Form Türü Tanımı
       /* peyk_pages.formTuruTanimi.click();
        BrowserUtils.waitFor(2);
        String eImzaDogrula = peyk_pages.formTuruListesi.getText();
        Assert.assertEquals(eImzaDogrula,"Form Türü Listesi");
        BrowserUtils.waitFor(4);

        //Firma Parametreleri
        peyk_pages.firmaParametreleri.click();
        BrowserUtils.waitFor(2);
        String firmaParam = peyk_pages.firmaParam.getText();
        Assert.assertEquals(firmaParam,"Firma Parametreleri");
        BrowserUtils.waitFor(2); */

        //Talep Form Editör
        peyk_pages.talepFormEditor.click();
        BrowserUtils.waitFor(2);
        String talepFormlari = peyk_pages.talepFormlari.getText();
        Assert.assertEquals(talepFormlari,"Talep Formları");
        BrowserUtils.waitFor(2);

        JavascriptExecutor jm = (JavascriptExecutor) getDriver();
        jm.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.rolIslemleri);
        BrowserUtils.waitFor(2);

    }
    @Test
    public void Bordro(){

        peyk_pages.ucretBordrosu.click();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(peyk_pages.ucretBordrosuYukle.getText(),"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(2);

        peyk_pages.ucretBordrosuYukle.click();
        BrowserUtils.waitFor(2);
        String ucBordYuk = peyk_pages.ucretBordrosuYukle.getText();
        Assert.assertEquals(ucBordYuk,"Ücret Bordrosu Yükle");
        BrowserUtils.waitFor(2);

        peyk_pages.donem.click();
        BrowserUtils.waitFor(2);
        peyk_pages.oca.click();
        peyk_pages.evet.click();
        BrowserUtils.waitFor(3);

        peyk_pages.bordroPdfYukleyiniz.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Jenkins\\Ali Boz-87197540786.pdf");
        BrowserUtils.waitFor(2);

        peyk_pages.dokumanlariYukle.click();
        BrowserUtils.waitFor(2);
        peyk_pages.checkBox.click();
        BrowserUtils.waitFor(3);

        peyk_pages.imzalaGonder.click();
        BrowserUtils.waitFor(2);

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.kayitSayisi);
        BrowserUtils.waitFor(2);

        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
        }

        peyk_pages.imzala.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(5);
        Assert.assertEquals(peyk_pages.bilgi.getText(),"Bilgi");
        BrowserUtils.waitFor(2);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(1);

        peyk_pages.donemIslemleri.click();
        BrowserUtils.waitFor(2);
        String ucBordDonIslemText = peyk_pages.ucBordDonIslem.getText();
        Assert.assertEquals(ucBordDonIslemText, "Ücret Bordrosu Dönem İşlemleri");
        BrowserUtils.waitFor(1);

        closeDriver();

    }
    @Test
    public void Form() {

        BrowserUtils.waitFor(2);
        peyk_pages.Form.click();
        BrowserUtils.waitFor(2);
        String formGonder = peyk_pages.formGond.getText();
        Assert.assertEquals(formGonder,"Form Gönder");
        BrowserUtils.waitFor(2);

        //Şablonlu Form Gönderimi
        peyk_pages.formGond.click();
        BrowserUtils.waitFor(2);
        String formGon = peyk_pages.formGond.getText();
        Assert.assertEquals(formGon,"Form Gönder");
        BrowserUtils.waitFor(2);
        peyk_pages.sec.click();
        BrowserUtils.waitFor(2);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.aliVeli.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(2);
        peyk_pages.imzalaGonder.click();
        BrowserUtils.waitFor(1);
        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
        }

        peyk_pages.imzala.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(5);
        peyk_pages.pdfOlusturuldu.isDisplayed();
        BrowserUtils.waitFor(2);

        peyk_pages.formIslemleri.click();
        BrowserUtils.waitFor(2);
        String topluformGonder = peyk_pages.topluFormGonder.getText();
        Assert.assertEquals(topluformGonder,"Toplu Form Gönder");
        BrowserUtils.waitFor(2);

        //Şablonsuz Form Gönderimi
        peyk_pages.formGond.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sablonsuzGonderim.click();
        BrowserUtils.waitFor(1);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Jenkins\\3_kişininMetni.pdf");
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanlariYukle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanEkle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Jenkins\\AliVeli-66362170898.pdf");
        BrowserUtils.waitFor(1);
        peyk_pages.dokumanlariYukle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaKonusu.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaKonusu.sendKeys("1");
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaIcerigi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaIcerigi.sendKeys("2");
        BrowserUtils.waitFor(1);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.aliVeli.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet1.click();
        BrowserUtils.waitFor(1);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(5);
        peyk_pages.ucKisininMetni.click();
        BrowserUtils.waitFor(1);
        peyk_pages.aliVeliPdf.click();
        BrowserUtils.waitFor(1);
        peyk_pages.topluFormGonder.click();
        BrowserUtils.waitFor(1);
        peyk_pages.sablonsuz1.click();
        peyk_pages.sablonsuz2.click();
        peyk_pages.imzalaGonder.click();
        BrowserUtils.waitFor(1);
        try {
            String pin = peyk_pages.pin.getText();
            BrowserUtils.waitFor(2);

            if (pin.contains("P")) {
                peyk_pages.eImzaPassword.click();
                peyk_pages.eImzaPassword.sendKeys("3944");
                BrowserUtils.waitFor(2);
            }
        }catch (Exception e){
            System.out.println("E-imza bulunmamaktadır!");
        }
        peyk_pages.imzala.click();
        BrowserUtils.waitFor(2);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(5);
        peyk_pages.pdfOlusturuldu.isDisplayed();
        BrowserUtils.waitFor(2);

        //Şablonsuz Taslak Kaydetme/Gönderme/Silme
        peyk_pages.formGond.click();
        BrowserUtils.waitFor(2);
        peyk_pages.sablonsuzGonderim.click();
        BrowserUtils.waitFor(1);
        peyk_pages.pdfUzantili.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Jenkins\\Ali Boz-87197540786.pdf");
        peyk_pages.dokumanlariYukle.click();
        BrowserUtils.waitFor(1);
        peyk_pages.ePostaKonusu.sendKeys("3");
        peyk_pages.ePostaIcerigi.sendKeys("4");
        BrowserUtils.waitFor(1);
        peyk_pages.taslagiKaydet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.formGond.click();
        BrowserUtils.waitFor(1);
        Assert.assertEquals(peyk_pages.sablonsuzTaslakAliBoz.getText(),"Ali Boz-87197540786");
        BrowserUtils.waitFor(1);
        peyk_pages.secAliBoz.click();
        BrowserUtils.waitFor(1);
        peyk_pages.calisanSecimi.click();
        BrowserUtils.waitFor(1);
        peyk_pages.aliVeli.click();
        BrowserUtils.waitFor(1);
        peyk_pages.kaydet1.click();
        BrowserUtils.waitFor(1);
        peyk_pages.onayla.click();
        BrowserUtils.waitFor(1);
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(2);
        peyk_pages.imzalaGonder.click();
        BrowserUtils.waitFor(2);
        peyk_pages.imzala.click();
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);
        peyk_pages.pdfGonderiliyor.isDisplayed();
        BrowserUtils.waitFor(2);
        peyk_pages.tanimlar.click();
        peyk_pages.formTanimlari.click();
        peyk_pages.formSablonlari.click();
        BrowserUtils.waitFor(1);
        peyk_pages.copKutusu.click();
        BrowserUtils.waitFor(1);
        peyk_pages.evet.click();
        BrowserUtils.waitFor(1);


        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.PEYK);
        BrowserUtils.waitFor(2);

    }

    @Test
    public void Arsivler() {

        Driver.getDriver().get("https://peyktest.kolaysoft.com.tr/accounting/login");
        peyk_pages.TcNo.sendKeys("admin_004329");
        peyk_pages.sifre.sendKeys("Ac,12345");
        peyk_pages.giris.click();
        BrowserUtils.waitFor(5);

        peyk_pages.PEYK.click();
        BrowserUtils.waitFor(2);

        BrowserUtils.waitFor(2);
        peyk_pages.arsivler.click();
        BrowserUtils.waitFor(2);
        String ucretBordrolarıArsiv = peyk_pages.ucretBordrolariArsiv.getText();
        Assert.assertEquals(ucretBordrolarıArsiv,"Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);

        peyk_pages.ucretBordrolariArsiv.click();
        BrowserUtils.waitFor(2);
        String ucretBordArs = peyk_pages.ucretBordArs.getText();
        Assert.assertEquals(ucretBordArs,"Ücret Bordroları Arşiv");
        BrowserUtils.waitFor(2);

        peyk_pages.formlarArs.click();
        BrowserUtils.waitFor(2);
        String formArs = peyk_pages.formArs.getText();
        Assert.assertEquals(formArs,"Formlar Arşiv");
        BrowserUtils.waitFor(2);

    }
    @Test
    public void IslemGecmisi() {

        BrowserUtils.waitFor(2);
        peyk_pages.islemGecmisi.click();
        BrowserUtils.waitFor(2);
        String islemGecmisi = peyk_pages.isGec.getText();
        Assert.assertEquals(islemGecmisi,"İşlem Geçmişi");
        BrowserUtils.waitFor(2);

    }
    @Test
    public void OzlukIslemleri() {

        BrowserUtils.waitFor(2);
        peyk_pages.OzlukIslemleri.click();
        BrowserUtils.waitFor(2);
        String ozlukFormOnay = peyk_pages.ozlukFormOnay.getText();
        Assert.assertEquals(ozlukFormOnay,"Özlük Form Onay");
        BrowserUtils.waitFor(2);

        peyk_pages.ozlukFormOnay.click();
        BrowserUtils.waitFor(2);
        peyk_pages.ozlukDosyalari.click();
        BrowserUtils.waitFor(3);
        String genelDurum = peyk_pages.genelDurumRaporu.getText();
        Assert.assertEquals(genelDurum,"Genel Durum Raporu İndir");
        BrowserUtils.waitFor(3);
        peyk_pages.sayfa2.click();
        BrowserUtils.waitFor(3);
        peyk_pages.ozlukKirmiziAliBoz.click();
        BrowserUtils.waitFor(3);
        //peyk_pages.dosyalariSec.click();
        peyk_pages.dosyalariSec.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Jenkins yeni\\aaron-burden-b9drVB7xIOI-unsplash.jpg");
        BrowserUtils.waitFor(3);
        peyk_pages.seciniz1.sendKeys("Özlük Formu");
        peyk_pages.seciniz1.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(3);
        peyk_pages.seciniz2.sendKeys("Fotoğraf Satırı");
        peyk_pages.seciniz2.sendKeys(Keys.ENTER);
        peyk_pages.kaydetOzluk.click();
        BrowserUtils.waitFor(1);
        peyk_pages.degistir.click();
        BrowserUtils.waitFor(5);
        peyk_pages.basarili.isDisplayed();
        peyk_pages.tamam.click();
        BrowserUtils.waitFor(3);
        peyk_pages.ozlukMaviButtonAliBoz.click();
        BrowserUtils.waitFor(3);
        peyk_pages.ozlukFormu.sendKeys("Özlük Formu" + Keys.ENTER);
        BrowserUtils.waitFor(5);
        peyk_pages.duzenle.click();
        peyk_pages.dosyaSec.sendKeys("C:\\Users\\Kolaysoft\\IdeaProjects\\PEYK_Jenkins yeni\\clement-fusil-Fpqx6GGXfXs-unsplash.jpg");
        peyk_pages.kaydet2.click();
        peyk_pages.evet.click();
        BrowserUtils.waitFor(3);
        peyk_pages.basarili.isDisplayed();
        peyk_pages.tamam.click();

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.PEYK);
        BrowserUtils.waitFor(2);

    }
    @Test
    public void RolIslemleri() {

        BrowserUtils.waitFor(2);
        peyk_pages.rolIslemleri.click();
        BrowserUtils.waitFor(2);
        String rolIslemleri = peyk_pages.rolOlusturma.getText();
        Assert.assertEquals(rolIslemleri,"Rol Oluşturma");
        BrowserUtils.waitFor(2);

        peyk_pages.rolOlusturma.click();
        BrowserUtils.waitFor(2);
        String rolListesi = peyk_pages.rolListesi.getText();
        Assert.assertEquals(rolListesi,"Rol Listesi");
        BrowserUtils.waitFor(2);

        peyk_pages.rolAtama.click();
        BrowserUtils.waitFor(2);
        String personelListesi = peyk_pages.personelListesi.getText();
        Assert.assertEquals(personelListesi,"Personel Listesi");
        BrowserUtils.waitFor(2);

    }
    @Test
    public void VekilYetkilendir() {

        BrowserUtils.waitFor(2);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",peyk_pages.vekilYetkilendirme);
        BrowserUtils.waitFor(2);

        peyk_pages.vekilYetkilendirme.click();
        BrowserUtils.waitFor(2);
        String islemGecmisi = peyk_pages.vekilYet.getText();
        Assert.assertEquals(islemGecmisi,"Vekil Yetkilendirme");
        BrowserUtils.waitFor(2);

    }

}
