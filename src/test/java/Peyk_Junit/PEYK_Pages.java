package Peyk_Junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PEYK_Pages {

    public PEYK_Pages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Ana Sayfa
    @FindBy(xpath = "//input[@id='username']")
    public WebElement TcNo;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement sifre;

    @FindBy(xpath = "//button[contains(text(), \"GİRİŞ\")]")
    public WebElement giris;

    @FindBy(xpath = "//button[@id='navbarDropdownMenuLink']")
    public WebElement kullanici;

    @FindBy(xpath = "//span[contains(text(), \"Çıkış\")]")
    public WebElement cikis;

    @FindBy(xpath = "//p[contains(text(), \"Ana Sayfa\")]")
    public WebElement anaSayfa;

    @FindBy(xpath = "//a/p[contains(text(), \"PEYK\")]")
    public WebElement PEYK;

    @FindBy(xpath = "//label[contains(text(), \"Bordro Gönder\")]")
    public WebElement bordroGonder;

    @FindBy(xpath = "//h4")
    public WebElement ucretBordrosuYuk;
    @FindBy(xpath = "//span[contains(text(), \" Ücret Bordrosu Yükle \")]")
    public WebElement ucretBordrosuYukle;

    @FindBy(xpath = "(//p[contains(text(), \"Form\")])[2]")
    public WebElement Form;

    @FindBy(xpath = "//label[contains(text(), \"Form Gönder\")]")
    public WebElement formGonder;

    @FindBy(xpath = "//button[contains(text(), \"Şablonsuz Gönderim\")]")
    public WebElement sablonsuzGonderim;

    @FindBy(xpath = "//label[contains(text(), \"Taslak Hazırla\")]")
    public WebElement taslakHazırla;

    @FindBy(xpath = "//button[contains(text(), \"Formu Önizle\")]")
    public WebElement formuOnizle;

    @FindBy(xpath = "//label[contains(text(), \"Özlük Form Onayı\")]")
    public WebElement ozlukFormOnayi;

    @FindBy(xpath = "//h4[contains(text(), \"Özlük İşlemleri\")]")
    public WebElement ozlukIslemleri;

    @FindBy(xpath = "//button[@label='Genel Durum Raporu İndir']")
    public WebElement genelDurumRaporu;

    @FindBy(xpath = "//div[contains(@style,'display: inline; padding: 0px; font-weight: bold; color: lightslategrey;') and contains(label,'Bordro')]")
    public WebElement bordro;

    @FindBy(xpath = "//h4[contains(text(), \"Ücret Bordroları Arşiv\")]")
    public WebElement ozlukBordrolarArsiv;

    @FindBy(xpath = "//div[contains(@style,'display: inline; padding: 0px; font-weight: bold; color: lightslategrey;') and contains(label,'Form')]")
    public WebElement form;

    @FindBy(xpath = "//h4[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formlarArsiv;

    @FindBy(xpath = "//span[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formlarArs;



    // Onay Bekleyenler
    @FindBy(xpath = "//p[contains(text(), \"Onay Bekleyenler\")]")
    public WebElement onayBekleyenler;

    @FindBy(xpath = "//h4[contains(text(), \"Onay Bekleyenler\")]")
    public WebElement onayBekDok;


    // Arsivler
    @FindBy(xpath = "//p[contains(text(), \"Arşivler\")]")
    public WebElement arsivler;

    @FindBy(xpath = "//span[contains(text(), \"Ücret Bordroları Arşiv\")]")
    public WebElement ucretBordrolariArsiv;

    @FindBy(xpath = "//h4[contains(text(), \"Ücret Bordroları Arşiv\")]")
    public WebElement ucretBordArs;

    /*@FindBy(xpath = "//span[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formlarArsiv;*/

    @FindBy(xpath = "//h4[contains(text(), \"Formlar Arşiv\")]")
    public WebElement formArs;


    // Form
    /*@FindBy(xpath = "//a[@href='#kepForm' and contains(p, \"Form\")]")
    public WebElement form;*/

    @FindBy(xpath = "//span[contains(text(), \" Form Gönder\")]")
    public WebElement formGond;

    @FindBy(xpath = "//label[contains(text(),'Form Gönder')]")
    public WebElement anaFormGonder;

    @FindBy(xpath = "//h4[contains(text(), \"Form Gönder\")]")
    public WebElement formGon;

    @FindBy(xpath = "//label[contains(text(),'Lütfen çalışan seçimi yapınız.')]")
    public WebElement calisanSecimi;

    @FindBy(xpath = "(//input[@type='checkbox'])[14]")
    public WebElement aliVeli;

    @FindBy(xpath = "//button[contains(text(), 'Kaydet')]")
    public WebElement kaydet;

    @FindBy(xpath = "//button[@class='btn-sm btn-icon TekBtn kaydet']")
    public WebElement kaydet1;

    @FindBy(xpath = "//button[contains(text(),'Onayla')]")
    public WebElement onayla;

    @FindBy(xpath = "(//button[contains(text(),'Seç')])[6]")
    public WebElement sec;

    @FindBy(xpath = "//span[contains(text(),'PDF imzalandı ve gönderiliyor')]")
    public WebElement pdfGonderiliyor;

    @FindBy(xpath = "//span[contains(text(),'PDF')]")
    public WebElement pdfOlusturuldu;

    @FindBy(xpath = "//input[@accept='.pdf']")
    public WebElement pdfUzantili;

    @FindBy(xpath = "//button[contains(text(), 'Yükle')]")
    public WebElement dokumanlariYukle;

    @FindBy(xpath = "//button[contains(text(), 'Taslağı Kaydet')]")
    public WebElement taslagiKaydet;

    @FindBy(xpath = "//div[contains(text(), 'Ali Boz-87197540786')]")
    public WebElement sablonsuzTaslakAliBoz;

    @FindBy(xpath = "(//button[contains(text(), 'Seç')])[4]")
    public WebElement secAliBoz;

    @FindBy(xpath = "(//i[@class=' fa fa-trash'])[1]")
    public WebElement copKutusu;

    @FindBy(xpath = "//button[contains(text(), 'Doküman Ekle')]")
    public WebElement dokumanEkle;

    @FindBy(xpath = "//textarea[@rows='3']")
    public WebElement ePostaKonusu;

    @FindBy(xpath = "//textarea[@rows='6']")
    public WebElement ePostaIcerigi;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement ucKisininMetni;

    @FindBy(xpath = "(//input[@type='checkbox'])[6]")
    public WebElement aliVeliPdf;

    @FindBy(xpath = "//span[contains(text(), \" Form İşlemleri\")]")
    public WebElement formIslemleri;

    @FindBy(xpath = "//button[@label='Toplu Form Gönder']")
    public WebElement topluFormGonder;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement sablonsuz1;

    @FindBy(xpath = "(//input[@type='checkbox'])[4]")
    public WebElement sablonsuz2;

    @FindBy(xpath = "//td[contains(text(),'Kayıt bulunamadı.')]")
    public WebElement kayitBulunamadi;


    // Islem Gecmisi
    @FindBy(xpath = "//span[contains(text(), \"İşlem Geçmişi\")]")
    public WebElement islemGecmisi;

    @FindBy(xpath = "//h4[contains(text(), \"İşlem Geçmişi\")]")
    public WebElement isGec;


    // OzlukIslemleri
    @FindBy(xpath = "//p[contains(text(), \"Özlük İşlemleri\")]")
    public WebElement OzlukIslemleri;

    @FindBy(xpath = "//span[contains(text(), \" Özlük Form Onay\")]")
    public WebElement ozlukFormOnay;

    @FindBy(xpath = "//a[contains(text(), \"Özlük Arşiv\")]")
    public WebElement ozlukArsiv;

    @FindBy(xpath = "//span[contains(text(), \" Özlük Dosyaları\")]")
    public WebElement ozlukDosyalari;

    @FindBy(xpath = "//a[contains(text(), \"2\")]")
    public WebElement sayfa2;

    @FindBy(xpath = "(//i[@class= \" fa fa fa-upload\"])[5]")
    public WebElement ozlukKirmiziAliBoz;

    @FindBy(xpath = "//input[@id=\"files\"]")
    public WebElement dosyalariSec;

    @FindBy(xpath = "(//div[@class= \" css-1hwfws3\"])[1]")
    public WebElement seciniz1;

    @FindBy(xpath = "(//div[@class= \" css-1hwfws3\"])[2]")
    public WebElement seciniz2;

    @FindBy(xpath = "//span[contains(text(), \"Kaydet\")]")
    public WebElement kaydetOzluk;

    @FindBy(xpath = "//button[contains(text(), \"EKLE\")]")
    public WebElement ekle;

    @FindBy(xpath = "//button[contains(text(), \"DEĞİŞTİR\")]")
    public WebElement degistir;

    @FindBy(xpath = "//h2[@id=\"swal2-title\"]")
    public WebElement basarili;

    @FindBy(xpath = "(//i[@class=\" fa fa fa-edit\"])[5]")
    public WebElement ozlukMaviButtonAliBoz;

    @FindBy(xpath = "//div[@id=\"react-select-13--value\"]")
    public WebElement seciniz;

    @FindBy(xpath = "//button[contains(text(),\"Düzenle\")]")
    public WebElement duzenle;

    @FindBy(xpath = "//button[contains(text(),\"Fotoğraf veya Dosya Seç \")]")
    public WebElement fotografDosyaSec;

    @FindBy(xpath = "//button[@label='Özlük İndir']")
    public WebElement ozlukIndir;


    // Rolislemleri
    @FindBy(xpath = "//p[contains(text(), \"Rol İşlemleri\")]")
    public WebElement rolIslemleri;

    @FindBy(xpath = "//span[contains(text(), \" Rol Oluşturma\")]")
    public WebElement rolOlusturma;

    @FindBy(xpath = "//h4[contains(text(), \"Rol Listesi\")]")
    public WebElement rolListesi;

    @FindBy(xpath = "//span[contains(text(), \" Rol Atama\")]")
    public WebElement rolAtama;

    @FindBy(xpath = "//h4[contains(text(), \"Personel Listesi\")]")
    public WebElement personelListesi;


    // Tanimlar
    @FindBy(xpath = "//a[contains(@data-toggle,'collapse') and contains(@href, '#kepTanim') and contains(p, 'Tanımlar')]")
    public WebElement tanimlar;

    @FindBy(xpath = "//span[contains(text(), \"Departman Tanımı\")]")
    public WebElement departmanTanimi;

    @FindBy(xpath = "//h4[contains(text(), \"Departman Listesi\")]")
    public WebElement departmanListesi;

    @FindBy(xpath = "//span[contains(text(), \" Departman Tür Tanımı\")]")
    public WebElement departmanTurTanimi;

    @FindBy(xpath = "//h4[contains(text(), \"Departman Türü Listesi\")]")
    public WebElement departmanTuru;

    @FindBy(xpath = "//p[contains(text(), \"Çalışan Tanımları\")]")
    public WebElement calisanTanimlari;

    @FindBy(xpath = "//span[contains(text(), \"Çalışanlar\")]")
    public WebElement calisanlar;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Listesi\")]")
    public WebElement calisanListesi;

    @FindBy(xpath = "//span[contains(text(), \" Çalışan Şifre Yönetimi\")]")
    public WebElement calisanSifreYon;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Şifre Yönetimi\")]")
    public WebElement calSifYon;

    @FindBy(xpath = "//span[contains(text(), \" Firma Bilgileri\")]")
    public WebElement firmaBilgileri;

    @FindBy(xpath = "//button[@label='Logo Yükle']")
    public WebElement logoYukle;

    @FindBy(xpath = "//span[contains(text(), \"Bilgilendirme Durumu\")]")
    public WebElement bilgilendirmeDurumu;

    @FindBy(xpath = "//h4[contains(text(), \"Çalışan Listesi\")]")
    public WebElement calisanBilgilendirmeList;

    @FindBy(xpath = "//span[contains(text(), \" Onay Akışı\")]")
    public WebElement onayAkisi;

    @FindBy(xpath = "//button[contains(text(), \"Yeni Oluştur\")]")
    public WebElement yeniOnayAkisi;

    @FindBy(xpath = "//span[contains(text(), \"E-imza Doğrulama\")]")
    public WebElement eImzaDog;

    @FindBy(xpath = "//label[contains(text(), \"Akıllı kart markası\")]")
    public WebElement AkilliKart;

    @FindBy(xpath = "//p[contains(text(), 'Form Tanımları')]")
    public WebElement formTanimlari;

    @FindBy(xpath = "//span[contains(text(), ' Form Şablonları')]")
    public WebElement formSablonlari;

    @FindBy(xpath = "//h4[contains(text(),'Form Şablonları')]")
    public WebElement formSablon;

    @FindBy(xpath = "//span[contains(text(),' Form Türü Tanımı')]")
    public WebElement formTuruTanimi;

    @FindBy(xpath = "//h4[contains(text(),'Form Türü Listesi')]")
    public WebElement formTuruListesi;

    @FindBy(xpath = "//span[contains(text(),' Firma Parametreleri')]")
    public WebElement firmaParametreleri;

    @FindBy(xpath = "//h4[contains(text(),'Firma Parametreleri')]")
    public WebElement firmaParam;

    @FindBy(xpath = "//span[contains(text(),' Talep Form Editör')]")
    public WebElement talepFormEditor;

    @FindBy(xpath = "//h4[contains(text(),'Talep Formları')]")
    public WebElement talepFormlari;


    // UcretBordrosu
    @FindBy(xpath = "//p[contains(text(), \"Ücret Bordrosu\")]")
    public WebElement ucretBordrosu;

    @FindBy(xpath = "(//input)[2]")
    public WebElement donem;

    @FindBy(xpath = "//td[contains(text(), \"Tem\")]")
    public WebElement tem;

    @FindBy(xpath = "//button[contains(text(), \"Evet\")]")
    public WebElement evet;

    @FindBy(xpath = "//input[@accept=\".pdf, .xlsx\"]")
    public WebElement bordroPdfYukleyiniz;

    @FindBy(xpath = "(//td/input[@type=\"checkbox\"])[1]")
    public WebElement checkBox;

    @FindBy(xpath = "//button[contains(text(), \"İmzala & Gönder\")]")
    public WebElement imzalaGonder;

    @FindBy(xpath = "//li[contains(text(), \"Kayıt Sayısı\")]")
    public WebElement kayitSayisi;

    @FindBy(xpath = "//div[contains(text(), \"Pin\")]")
    public WebElement pin;

    @FindBy(xpath = "//div/div/div/input[@type=\"password\"]")
    public WebElement eImzaPassword;

    @FindBy(xpath = "//button[contains(text(), \"İmzala\")]")
    public WebElement imzala;

    @FindBy(xpath = "//h2")
    public WebElement bilgi;

    @FindBy(xpath = "//button[contains(text(), \"Tamam\")]")
    public WebElement tamam;

    @FindBy(xpath = "//span[contains(text(), \" Dönem İşlemleri\")]")
    public WebElement donemIslemleri;

    @FindBy(xpath = "//h4[contains(text(), \"Ücret Bordrosu Dönem İşlemleri\")]")
    public WebElement ucBordDonIslem;


    // VekilYetkilendirme
    @FindBy(xpath = "//p[contains(text(), \"Vekil Yetkilendirme\")]")
    public WebElement vekilYetkilendirme;

    @FindBy(xpath = "//h4[contains(text(), \"Vekil Yetkilendirme\")]")
    public WebElement vekilYet;



}
