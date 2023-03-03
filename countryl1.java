package level1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

   
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Xpathl1.Countrypackages;
import utilities.Costand;
import utilities.datadriven;


public class countryl1 extends urlopen {
	Countrypackages cp=new Countrypackages(getDriver());
	WebDriverWait wait = new WebDriverWait(getDriver(),20);
    Actions mouse=new Actions(getDriver());
	static datadriven excelUtils = new datadriven();
	static String excelFilePath=Costand.Path_TestData+Costand.File_TestData;  
	public void countryopen() {
		try {
//			Robot ac=new Robot();
//			Thread.sleep(1500L);
//			ac.keyPress(KeyEvent.VK_CONTROL);
//			ac.keyPress(KeyEvent.VK_R);
//			ac.keyRelease(KeyEvent.VK_CONTROL);
//			ac.keyRelease(KeyEvent.VK_R);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("2")));
			cp.Masterdata().click();
			JavascriptExecutor js= (JavascriptExecutor) getDriver();
			WebElement scroll=cp.Facility();
			js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ul2\"]/div/div[8]")));
            cp.Facility().click();
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[1]/div[3]/section[1]/aside[1]/div[1]/ul[1]/div[2]/ul[1]/div[1]/div[8]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")));
	        cp.Country().click();
	        WebElement Openpage=cp.CountryPGopen();
	        WebElement OpenWait= wait.until(ExpectedConditions.visibilityOf(Openpage));
	        Boolean openpage=OpenWait.isDisplayed();
	        System.out.println(""+openpage);
	        if(openpage) {
	        	Thread.sleep(3500L);
	        	System.out.println("The Country Form is  Opened");
	        	countryBTS();
	        }else {
	        	System.out.println("The Country Form is Not Opened");
	        	cp.Countrypageclose().click();
	        }
		}catch(Exception e) {
			System.out.println("Error on OPEN COUNTRY");
		}
	}
//	Button Available Are Not Checking Functions
	public void countryBTS() {
		try {
				
			Boolean Filter=cp.CountryFilter().isDisplayed();
			if(Filter==true) {
				System.out.println("Filter Icons is Available");
			}else {
				System.out.println("Filter Icons is Not Available");
			}
			Boolean Column=cp.Countrycolumn().isDisplayed();
			if(Column==true) {
				System.out.println("Column Re-Arrange Icons is Available");
			}else {
				System.out.println("Column Re-Arrange Icons is Not Available");
			}
			Boolean migration=cp.Countrymigration().isDisplayed();
			if(migration==true) {
				System.out.println("Migration Icons is Available");
			}else {
				System.out.println("Migration Icons is Not Available");
			}
			Boolean Print=cp.Countryprint().isDisplayed();
			if(Print==true) {
				System.out.println("Print Icons is Available");
			}else {
				System.out.println("Print Icons is Not Available");
			}
			Boolean Export=cp.Countryexportexcel().isDisplayed();
			if(Export==true) {
				System.out.println("Export Excel Icons is Available");
			}else {
				System.out.println("Export Excel Icons is Not Available");
			}
			Boolean Refresh=cp.Countryrefresh().isDisplayed();
			if(Refresh==true) {
				System.out.println("Refresh  Icons is Available");
			}else {
				System.out.println("Refresh  Icons is Not Available");
			}
			Boolean Card=cp.Countryrefresh().isDisplayed();
			if(Card==true) {
				System.out.println("Card View  Icons is Available");
			}else {
				System.out.println("Card View  Icons is Not Available");
			}
			Boolean ScrollTable=cp.Countryscroll().isDisplayed();
			if(ScrollTable==true) {
				System.out.println("ScrollTable  Icons is Available");
			}else {
				System.out.println("ScrollTable Icons is Not Available");
			}
//			CountryAddpage();
		}catch(Exception e) {
			System.out.println("ERROR on Country Buttons");
		}
	}
// Country Registry Check and Add the Country	
	public void CountryAddpage() {
		try {
			System.out.println("Pass");
			WebElement AddW=cp.Countryaddbt();
		    WebElement AddbT=wait.until(ExpectedConditions.visibilityOf(AddW));
			Boolean Add=AddbT.isDisplayed();
			if(Add) {
				System.out.println("Add Button  Icons is Available");
				cp.Countryaddbt().click();
			}else {
				System.out.println("Add Button  Icons is Not Available");
			}
			WebElement Fields=cp.CountryFieldsListP();
		    wait.until(ExpectedConditions.visibilityOf(Fields));
			Boolean Countryregistry=cp.CountryRegistryform().isDisplayed();
			if(Countryregistry) {
				System.out.println("Country Registry Forms is Opened");
				Boolean allclear=cp.CountryClearbt().isDisplayed();
				if(allclear==true) {
					System.out.println("Clear Button   is Available");
				}else {
					System.out.println("Clear Button  is Not Available");
				}
				Boolean DraftBt=cp.CountryDraftbt().isDisplayed();
				if(DraftBt==true) {
					System.out.println("Draft Button   is Available");
				}else {
					System.out.println("Draft Button  is Not Available");
				}
				Boolean Save=cp.CountrySavebt().isDisplayed();
				if(Save==true) {
					System.out.println("Save Button   is Available");
				}else {
					System.out.println("Save Button  is Not Available");
				}
				Boolean Close=cp.CountryCloseBt().isDisplayed();
				if(Close==true) {
					System.out.println("Close Button   is Available");
				}else {
					System.out.println("Close Button  is Not Available");
				}
				Boolean Code=cp.CountryCode().isDisplayed();
				if(Code==true) {
					System.out.println("Country Code Field   is Available");
				}else {
					System.out.println("Country Code Field  is Not Available");
				}
				Boolean Name=cp.Countryname().isDisplayed();
				if(Name==true) {
					System.out.println("Country Name Field   is Available");
				}else {
					System.out.println("Country Name Field  is Not Available");
				}
				Boolean Currencycode=cp.Countrycurrencycode().isDisplayed();
				if(Currencycode==true) {
					System.out.println("Country CurrencyCode Field   is Available");		
				}else {
					System.out.println("Country CurrencyCode Field  is Not Available");
				}
				Boolean Currencyname=cp.CountryCurrencyname().isDisplayed();
				if(Currencyname==true) {
					System.out.println("Country CurrencyName Field   is Available");
				}else {
					System.out.println("Country CurrencyName Field  is Not Available");
				}
			excelUtils.setExcelFile(excelFilePath,"Sheet1");
			int Count=excelUtils.getRowCountInSheet();
            cp.CountryCode().sendKeys(excelUtils.getCellData(1, 0));
            cp.Countryname().sendKeys(excelUtils.getCellData(1, 1));
            cp.Countrycurrencycode().sendKeys(excelUtils.getCellData(1, 2));
            cp.CountryCurrencyname().sendKeys(excelUtils.getCellData(1, 3));
            cp.CountrySavebt().click();
            WebElement ConfirmpoupYes=cp.CountrysavepoupYes();
            WebElement Yes=wait.until(ExpectedConditions.visibilityOf(ConfirmpoupYes));
            Boolean Yespopup=Yes.isDisplayed();
            if(Yespopup) {
            	 cp.CountrysavepoupYes().click();
            	 WebElement POPUP=cp.CountryPOPUP();
            	 WebElement alesrtmsg=wait.until(ExpectedConditions.visibilityOf(POPUP));
            	 Boolean msg=alesrtmsg.isDisplayed();
            	 if(msg) {
            		 String popupmsg=cp.CountryPOPUP().getText();
                     if(popupmsg.contains("Saved Successfully")) {
                     	System.out.println("A New Country is created Sucessfully");
                     }else {
                     	System.out.println("A New Country is Not create ");
                     	System.out.println("Aleart Message=="+popupmsg);
                   }
            	 }else {
            		 //Seek issue refresh function
            		 System.out.println("When Saved Seek issue");
            	 } 		
            }else {
            	 String popupmsginvalid=cp.CountryPOPUP().getText();
            	System.out.println("The Confirm Popup is not visiable" +popupmsginvalid);
            }
			}else {
 				System.out.println("Country Registry Forms is not Opened");
 			} 
			 WebElement POPUP=cp.CountryPOPUP();
            wait.until(ExpectedConditions.invisibilityOf(POPUP));
            cp.CountryCloseBt().click();
            CountryViewPage();
		}catch(Exception e) {
			System.out.println("Error ON CountryAddPage");
		}
	}
	public void CountryViewPage() {
		   try {
				cp.CountryViewIcon().click();
				Boolean viewpg=cp.CountryViewPage().isDisplayed();
				if(viewpg) {
					System.out.println("View Page is Opened");
					Boolean EditBT=cp.CountryEditBt().isDisplayed();
					if(EditBT==true) {
						System.out.println("Edit Button   is Available");
					}else {
						System.out.println("Edit Button  is Not Available");
					}
					Boolean AddBT=cp.CountryEditBt().isDisplayed();
					if(AddBT==true) {
						System.out.println("Add Button   is Available");
					}else {
						System.out.println("Add Button  is Not Available");
					}
					Boolean Close=cp.CountryCloseBt().isDisplayed();
					if(Close==true) {
						System.out.println("Close Button   is Available");
						
					}else {
						System.out.println("Close Button  is Not Available");
					}
					String Viewtext=cp.CountryViewTextFields().getText();
					System.out.println("View PAge Fields Contains=="+Viewtext);
					cp.CountryEditBt().click();
				}else {
					System.out.println("View Page is Not Opened");
				}
				 CountryUpdatePage(); 
		   }catch(Exception e) {
				System.out.println("Error ON CountryViewPage");
		   }
	}
	public void CountryUpdatePage() {
		try {
			Boolean Attachment=cp.CountryAttachment().isDisplayed();
			if(Attachment==true) {
				System.out.println("Attachment Icon is Available");
			}else {
				System.out.println("Attachment Icon is Not Available");
			}
			Boolean Update=cp.Countryupdate().isDisplayed();
			if(Update==true) {
				System.out.println("Update Button is Available");
			}else {
				System.out.println("Update Button is Not Available");
			}
			Boolean Close=cp.CountryCloseBt().isDisplayed();
			if(Close==true) {
				System.out.println("Close Button   is Available");
				
			}else {
				System.out.println("Close Button  is Not Available");
			}
			cp.CountryCodeclear().click();
			cp.Countrynameclear().click();
			cp.Countrycurrencycodeclear().click();
			cp.CountryCurrencynameclear().click();
			cp.CountryCode().sendKeys(excelUtils.getCellData(2, 0));
            cp.Countryname().sendKeys(excelUtils.getCellData(2, 1));
            cp.Countrycurrencycode().sendKeys(excelUtils.getCellData(2, 2));
            cp.CountryCurrencyname().sendKeys(excelUtils.getCellData(2, 3));
            cp.Countryupdate().click();
            WebElement ConfirmpoupYes=cp.CountrysavepoupYes();
            WebElement Yes=wait.until(ExpectedConditions.visibilityOf(ConfirmpoupYes));
            Boolean Yespopup=Yes.isDisplayed();
            if(Yespopup) {
            	 cp.CountrysavepoupYes().click();
            	 WebElement POPUP=cp.CountryPOPUP();
            	 WebElement alesrtmsg=wait.until(ExpectedConditions.visibilityOf(POPUP));
            	 Boolean msg=alesrtmsg.isDisplayed();
            	 if(msg) {
            		 String popupmsg=cp.CountryPOPUP().getText();
                     if(popupmsg.contains("Updated Successfully")) {
                     	System.out.println("A New Country is Updated Sucessfully");
                     }else {
                     	System.out.println("A New Country is Not Update ");
                     	System.out.println("Aleart Message=="+popupmsg);
                   }
            	 }else {
            		 System.out.println("Seek issue");
            	 }
            }else {
            	System.out.println("Issue to saved");
            }
            WebElement POPUP=cp.CountryPOPUP();
            wait.until(ExpectedConditions.invisibilityOf(POPUP));
            cp.CountryCloseBt().click();
		}catch(Exception e) {
			System.out.println("Error ON CountryUpdatePage");
		}
	}
	public void CountryAttachment() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[@id='AdminCountryRegistryTable0']/td[1]/*[2]")));
			cp.CountryEditIcon().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CountryOpenAttachment")));
            cp.CountryAttachment().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("overlayimgAttAdminCountryRegistry")));
            cp.Countryattachmentaddsymbol().sendKeys("C:\\Users\\Nanosoft\\Pictures\\Screenshots\\Screenshot (79).png");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("overlayPreviewAdminCountryRegistry")));
            cp.Countryattachmentaddprivewpg().sendKeys("C:\\Users\\Nanosoft\\Pictures\\Screenshots\\Screenshot (80).png");
            cp.CountryattachmentType().sendKeys("IMAGE");
            cp.CountryattachmentRemarks().sendKeys("Image Remarks");
            Thread.sleep(500L);
            cp.Countryattachmentpreviewsave().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AttachmentImage")));
            cp.Countryattachmentclose().click();
            System.out.println("pass");
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlayimgAttAdminCountryRegistry")));
            System.out.println("pass1"); 
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CountryOpenAttachment")));
            cp.CountryAttachment().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("AttachmentImage")));
            cp.CountryattachmentIMAGE().click();
            Boolean imageviewpg=cp.CountryAttachmentPrivewimagepg().isDisplayed();
            if(imageviewpg.TRUE) {
            	System.out.println(" image Preview is Opened");
            	Boolean download=cp.CountryAttchmentDownload().isDisplayed();
            	if(download.TRUE) {
            		System.out.println("DownLoad Button Is Available");
            	}else {
            		System.out.println("DownLoad Button Is  not Available");
            	}
            	Boolean Close=cp.CountryImagepgclose().isDisplayed();
            	if(Close.TRUE) {
            		System.out.println("Close Button Is Available");
            	}else {
            		System.out.println("Close Button Is  not Available");
            	}
            	Boolean Right=cp.CountryImagepgmoveright().isDisplayed();
            	if(Right.TRUE) {
            		System.out.println("Move Right Button Is Available");
            	}else {
            		System.out.println("Move Right Button Is  not Available");
            	}
            	Boolean Left=cp.CountryImagepgmoveleft().isDisplayed();
            	if(Left.TRUE) {
            		System.out.println("Move Left Button Is Available");
            	}else {
            		System.out.println("Move Left Button Is  not Available");
            	}
            	Boolean Text=cp.CountryPreviewTextContent().isDisplayed();
            	if(Text.TRUE) {
            		System.out.println("Text Content Is Available");
            		String content=cp.CountryPreviewTextContent().getText();
            		System.out.println("Content=="+content);
            	}else {
            		System.out.println("Text Content  not Available");
            	}
            }else {
        		System.out.println("Preview Image Page is Not Opened");
          }
            cp.CountryImagepgmoveright().click();
            cp.CountryAttchmentDownload().click();
            cp.CountryImagepgclose().click();
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("ImgPrivAttImgAdminCountryRegistry")));
            cp.CountryattachmentDELETE().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Yes')]")));
            cp.CountrysavepoupYes().click();
            cp.Countryattachmentclose().click();
            cp.Countryupdate().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Yes')]")));
            cp.CountrysavepoupYes().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
            String popupmsg=cp.CountryPOPUP().getText();
            if(popupmsg.contains("Updated Successfully")) {
            	System.out.println("A  Country is Updated With Attachment Sucessfully");
            }else {
            	System.out.println("A  Country is Not Update With Attachment ");
            	System.out.println("Aleart Message="+popupmsg);
            }
            cp.CountryCloseBt().click();
		}catch(Exception e){
			System.out.println("Error ON CountryAttachment");
         }
	}
	public void CountryFilter() {
		try {
			cp.CountryFilter().click();
		 List<WebElement> filteritems=cp.CountryFilterItems().findElements(By.className("FilterItemDivTitle"));
			int Filtersize=filteritems.size();
			System.out.println(""+Filtersize);
			for(int i=0;i<=Filtersize-2;i++) {
			   filteritems=cp.CountryFilterItems().findElements(By.className("FilterItemDivTitle"));
		       Thread.sleep(1000L);
			  filteritems.get(i).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("FilterItemDiv")));
				List<WebElement> filteritemslist=cp.CountryFilterDataList().findElements(By.className("FilterItemDiv"));
				int list=filteritemslist.size();
				if(list > 3) {
					for(int j=0;j<3;j++) {
						filteritemslist.get(j).click();
					}
					List<WebElement> filteritemsselected=cp.CountrySelectitempg().findElements(By.className("filterSelectedItems"));
					 int selectitem=filteritemsselected.size();
					    cp.CountryFilterDataSearch().click();
					    Thread.sleep(1000L); 
					    List<WebElement> tablebody=cp.CountryTableBody().findElements(By.tagName("tr"));
					    int tbody=tablebody.size();
					    if(selectitem==tbody/2) {
					    	System.out.println("Filter data sucessfully");
					    }else {
					    	System.out.println("Filter data sucessfully");
					    }
					    cp.CountryFilterSelectItemClear().click();
				}else {
					System.out.println("Only 3 Filter items available to filter");
				}
			}
// Date Filter Funcationality
			cp.CountryFilterDate().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MonthFilter")));
			List<WebElement> datecomponent=cp.CountryFilterDateComponent().findElements(By.tagName("svg"));
			int datelist=datecomponent.size();
			for(int k=0;k<=datelist-5;k++) {
				datecomponent=cp.CountryFilterDateComponent().findElements(By.tagName("svg"));
				cp.CountryFilterDateComponent().findElements(By.tagName("div["+k+"]"));
				datecomponent.get(k).click();
				Thread.sleep(1000L);
				List<WebElement> tablebodydate=cp.CountryTableBody().findElements(By.tagName("tr"));
			    int tbodydate=tablebodydate.size();
			    if(tbodydate==0) {
			    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
			    	System.out.println("Country created on the Date=" + tbodydate);
			    }else {
			    	System.out.println("Country created on the Date=" + tbodydate/2);
			    }
			}
			
//// Date Filter FuncationalityFor Month
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("MonthFilter")));
//			cp.CountryFilterMonth().click();
//			System.out.println("pass");
//			Thread.sleep(1000L);
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("MuiPickersMonthSelection-container")));
//			System.out.println("pass1");
//			List<WebElement> MonthContainer=cp.CountryMonthcontainer().findElements(By.tagName("div"));
//			System.out.println("pass2");
//			int Mcontainersize=MonthContainer.size();
//			String object="Feb";
//			for(int l=0;l<=Mcontainersize;l++) {
//				String Months=MonthContainer.get(l).getText();
//				while(Months.equals(object)) 
//					MonthContainer.get(l).click();
//				    break;
//			}
//			cp.CountryDateGo().click();
//			Thread.sleep(2000L);
//			List<WebElement> tablebodydate=cp.CountryTableBody().findElements(By.tagName("tr"));
//		    int tbodydate=tablebodydate.size();
//		    if(tbodydate==0) {
//		    	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
//		    	System.out.println("Country created on the Date=" + tbodydate);
//		    }else {
//		    	System.out.println("Country created on the Date=" + tbodydate/2);
//		    }
//// 	Date Filter Functionality For Year	
//        			    String yrs="2022";    
//     cp.CountryFilterYear().click();
//     List<WebElement> yearlist=cp.CountryFilterYearlist().findElements(By.tagName("div"));
//          int year=yearlist.size();
//          System.out.println(""+year);
//          for(int y=0;y<=year;y++) {
//        	  String years=yearlist.get(y).getText();
////        	  System.out.println("Pass"+years);
//        	  while(years.equals(yrs))
//        		  yearlist.get(y).click();
//        	  Thread.sleep(1000L);
//        	      cp.CountryDateGo().click();
//        	     
//        	 }
//          System.out.println("Pass");
             
		    
		}catch(Exception e) {
			System.out.println("Error ON CountryFilter");
		}
	}
	public void CountryRearrangeColumn() {
		try {
			cp.Countrycolumn().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("CheckBoxLabel")));
			System.out.println("pass");
		    List<WebElement> ColumnsRe=cp.CountryColumnlistrearrange().findElements(By.className("CheckBoxLabel"));
			String TBH1=cp.CountryTBHeader().getText();
			System.out.println(""+TBH1);
			WebElement Value1=cp.CountryColumnRitem1();
			WebElement Value2=cp.CountryColumnRitem2();
			System.out.println("pass");
		    mouse.clickAndHold(Value1).moveToElement(Value2).release(Value1).build().perform();
		    cp.CountryApplyBt().click();
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
		    String pop1=cp.CountryPOPUP().getText();
		    System.out.println(""+pop1);
		    Thread.sleep(1500L);
		    String TBH2=cp.CountryTBHeader().getText();
		    System.out.println(""+TBH2);
			if(TBH1.equals(TBH2)) {
				System.out.println("Rearrange the Column UNSucessFully");
			}else {
				System.out.println("Rearrange the Column SucessFully");
			}
// Have to Repeat the Step again	
			cp.Countryprint().click();
		    Thread.sleep(4500L);
		    Robot ac=new Robot();
			ac.keyPress(KeyEvent.VK_WINDOWS);
			 ac.keyPress(KeyEvent.VK_PRINTSCREEN);
			 ac.keyRelease(KeyEvent.VK_WINDOWS);
		     ac.keyRelease(KeyEvent.VK_PRINTSCREEN);
		     Thread.sleep(200L);
			 ac.keyPress(KeyEvent.VK_ESCAPE);
			 ac.keyRelease(KeyEvent.VK_ESCAPE);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div[1]/div[4]/div[1]/div[2]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[2]/*[1]")));
			 cp.Countryexportexcel().click();
			 cp.Countryrefresh().click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("button-11")));
			 cp.Countrycardview().click();
			 Boolean CView=cp.CountryCardViewpg().isDisplayed();
             if(CView.TRUE)	{
            	 System.out.println("Card View is Opened");
            	 cp.Countrycardview().click();
             }else {
            	 System.out.println("Card View is Not Opened");
             }
			
		}catch(Exception e) {
			System.out.println("Error ON CountryRearrangeColumn");
		}
	}
	public void Countryfields() {
		try {
			cp.Countryaddbt().click();
			List<WebElement> Inputs=cp.CountryFieldsListP().findElements(By.tagName("input"));
			int inputsize=Inputs.size();
			System.out.println(""+ inputsize);
			for(int i=0;i<=inputsize-2;i++) {
				Inputs.get(i).click();
				WebElement Maxlength=Inputs.get(i);
				String Max=Maxlength.getAttribute("maxlength");
			    int length=Integer.parseInt(Max);
				for(int j=0;j<=length+5;j++) {
					Maxlength.sendKeys("a");
				}
				String valuesize=Maxlength.getAttribute("value");
				Integer valuelength=valuesize.length();
				if(length==valuelength) {
					 System.out.println("input Validation passed "+i);
					 }else {
					 System.out.println("input Validation failed "+i);
				 }
			}
				cp.CountryClearbt().click();
				cp.CountryDraftbt().click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
				String Dpoup=cp.CountryPOPUP().getText();
				if(Dpoup.contains("Please enter the primary fields")) {
					cp.CountryCode().sendKeys("Draft");
					cp.CountryDraftbt().click();
					System.out.println("A Fields is Add to the Draft ");
				}else {
					System.out.println("A Empty fields is Add to the Draft ");
				}
		}catch(Exception e) {
			System.out.println("Error ON Countryfields");
		}
	}
	public void CountryDropDowns() {
		try {
//			cp.Countryaddbt().click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
			List<WebElement> Forms=cp.CountryFieldsListP().findElements(By.tagName("form"));
			int Formsize=Forms.size();
//			System.out.println(""+ Formsize);
			for(int i=0;i<=Formsize-2;i++) {
				WebElement input=Forms.get(i).findElement(By.tagName("input"));
				input.click();
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("CountryDropdown")));
				Thread.sleep(1500L);
			List<WebElement> DropList=cp.CountryDropdownul().findElements(By.tagName("li"));
			int Size=DropList.size();
//			System.out.println(""+Size);
             if(Size<=10) {
            	 System.out.println("Less than 10 Records is Available");
             }else {
            	 cp.CountryViewMore().click();
            	 List<WebElement> DropListV=cp.CountryDropdownul().findElements(By.tagName("li"));
     			 int SizeV=DropList.size();
     			 cp.Countryrefresh().click();
//     		     System.out.println(""+SizeV);
            }
			}
			cp.CountryCloseBt().click();
		}catch(Exception e) {
			System.out.println("Error ON CountryDropDowns");
		}
	}
	public void CountryPagenationandSearch() {
		try {
			
		}catch(Exception e) {
			System.out.println("Error On CountryPagenation");
		}
	}
	public void CountrySearch() {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='search_input']")));
			cp.CountrySearchBox().sendKeys("aF");
			Thread.sleep(500L);
			List<WebElement> tr=cp.CountryTableBody().findElements(By.tagName("tr"));
			int tbsize=tr.size();
			System.out.println(""+tbsize/2);
			if(tbsize==0) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));	
				String serachpoup=cp.CountryPOPUP().getText();
				System.out.println("While No Records in the Table="+serachpoup);
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
				cp.CountrySearchBoxclear().click();
			}else {
				 for(int i=0;i<=tbsize-1;i++) {
					 String Text=tr.get(i).getText();
					 System.out.println(""+Text);
					 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='search_input']"))); 
				 }
				 cp.CountrySearchBoxclear().click();
			}
			System.out.println("pass");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//thead[@class='MuiTableHead-root']/tr/th/*[2]")));
			List<WebElement> THeadsvg=cp.CountryTable().findElements(By.xpath("//thead/tr/th/*[2]"));
			int Searchsize=THeadsvg.size();
			System.out.println(""+Searchsize);
			for(int i=0;i<=THeadsvg.size()-1;i++) {
				THeadsvg=cp.CountryTable().findElements(By.xpath("//thead/tr/th/*[2]"));
				
				THeadsvg.get(i).click();
				
			}
		}catch(Exception e) {
			System.out.println("Error On CountrySearch");
		}
	}
	
	public void CountryPagenation() {
		try {
			List<WebElement> tr=cp.CountryTableBody().findElements(By.tagName("tr"));
			int tbsize=tr.size()/2;
			System.out.println(""+tbsize);
			if(tbsize>=10) {
			cp.CountryPagenationBox().click();
			cp.CountryPageSize20().click();
			Thread.sleep(2000L);
//			WebElement Tab20=cp.CountryTableBody();
		//	wait.until(ExpectedConditions.visibilityOf(Tab20));
//		/	getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			List<WebElement> tr20=cp.CountryTableBody().findElements(By.tagName("tr"));
			int tbsize20=tr20.size()/2;
			System.out.println(""+tbsize20);
			if(tbsize20>=20) {
//				have inseart the click function
				List<WebElement> tr20f=cp.CountryTableBody().findElements(By.tagName("tr"));
				int tbsize20f=tr20f.size()/2;
				if(tbsize20f>=20) {
					cp.CountryPagenationBox().click();
					cp.CountryPageSize50().click();
					List<WebElement> tr50=cp.CountryTableBody().findElements(By.tagName("tr"));
					int tbsize50=tr50.size()/2;
					if(tbsize50>=50) {
//						have inseart the click function
						List<WebElement> tr50f=cp.CountryTableBody().findElements(By.tagName("tr"));
						int tbsize50f=tr50f.size()/2;
						if(tbsize50f>=50) {
							cp.CountryPagenationBox().click();
							cp.CountryPageSize100().click();
							List<WebElement> tr100=cp.CountryTableBody().findElements(By.tagName("tr"));
							int tbsize100=tr100.size()/2;
							if(tbsize100>=100) {
//								have inseart the click function
								List<WebElement> tr100f=cp.CountryTableBody().findElements(By.tagName("tr"));
								int tbsize100f=tr100f.size()/2;
							}else {
								System.out.println("Less To 50 Records are  Available");
							}

						}else {
							System.out.println("Less To 50 Records are  Second page Available");
						}
					}else {
						System.out.println("Less To 50 Records are  Available");
					}
						
				}else {
					System.out.println("Less To 20 Records are  Second page Available");
				}
				
			}else {
				System.out.println("Less To 20 Records are Available");
			}
			}else {
				System.out.println("Less To 10 Records are Available");
			}
		}catch(Exception e) {
			System.out.println("Error On CountryPagenation");
		}
	}
	public void CountryDraft() {
		try {
			cp.Countrydrafticon().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ListHeader displayFlex']")));
		    Thread.sleep(500L);
			cp.CountryViewIcon().click();    
			Boolean viewpg=cp.CountryViewPage().isDisplayed();
			if(viewpg.TRUE) {
				System.out.println("View Page is Opened");
				Boolean EditBT=cp.CountryEditBt().isDisplayed();
				if(EditBT.TRUE) {
					System.out.println("Edit Button   is Available");
				}else {
					System.out.println("Edit Button  is Not Available");
				}
			}
			cp.CountryEditBt().click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("FieldsCoy")));
			cp.CountryCodeclear().click();
			excelUtils.setExcelFile(excelFilePath,"Sheet1");
			int Count=excelUtils.getRowCountInSheet();
			System.out.println("pass");
			cp.CountryCode().sendKeys(excelUtils.getCellData(2, 0));
            cp.Countryname().sendKeys(excelUtils.getCellData(2, 1));
            cp.Countrycurrencycode().sendKeys(excelUtils.getCellData(2, 2));
            cp.CountryCurrencyname().sendKeys(excelUtils.getCellData(2, 3));
            cp.Countryupdate().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Yes')]")));
            cp.CountrysavepoupYes().click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
            String popupmsg=cp.CountryPOPUP().getText();
            if(popupmsg.contains("Updated Successfully")) {
            	System.out.println("A Draft Country is Updated Sucessfully");
            }else {
            	System.out.println("A Draft Country is Not Update ");
            	System.out.println("Aleart Message="+popupmsg);
            }
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"TabContents\"]/div[2]")));
            cp.CountryDraftBack().click();
          
		}catch(Exception e) {
			System.out.println("Error On CountryDraft");
		}
	}
	}

