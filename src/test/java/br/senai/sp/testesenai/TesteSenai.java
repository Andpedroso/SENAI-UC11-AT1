package br.senai.sp.testesenai;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteSenai 
{
	private WebDriver driver;
	
	@Before
	public void Setup() 
	{
		System.setProperty( "webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe" );
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait( 2, TimeUnit.SECONDS );
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void TesteNavegadorSenai() 
	{
		driver.get( "https://online.sp.senai.br/" );
		
		//Teste da Fun��o de Busca de Cursos
		
		//WebElement input = driver.findElement( By.id( "Busca1_txtFiltro" ) );
		
		//input.sendKeys( "Automa��o" );
		
		//input.sendKeys( "auto" );
		
		//driver.findElement( By.id( "Busca1_btnBusca" ) ).click();
		
		//Teste do menu, roteamento da p�gina.
		
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[1]/a" ) ).click();
		
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[2]/a" ) ).click();
		
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[3]/a" ) ).click();
				
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[4]/a" ) ).click();
				
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[5]/a" ) ).click();
				
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[7]/a" ) ).click();
		
		//Teste do menu, para outro endere�o web.
		
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[6]/a" ) ).click();
		
		//driver.findElement( By.xpath( "//*[@id=\"nav\"]/li[8]/a" ) ).click();
	}
}
