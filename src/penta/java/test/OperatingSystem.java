package penta.java.test;


class SysFile

{
	String file_name;
	String file_extn;
	double file_size;
	
	public SysFile(String file_name , String file_extn ,long file_size)
	{
		this.file_name = file_name;
		this.file_extn = file_extn;
		this.file_size = file_size;
	}
	public void displayFileInfo()
	{
		System.out.println("File Name: " + file_name);
        System.out.println("File Extension: " + file_extn);
        System.out.println("File Size: " + file_size + " bytes");
	}
	
	
}

class JpegFile extends SysFile
{
	
	public JpegFile(String file_name,String file_extn, long file_size)
	{
		super(file_name,"jpgfile",file_size);
	}
	@Override
	public void displayFileInfo()
	{
		System.out.println("The file type is : JPEG");
		
	}
	
	public void fileBehaviour()
	{
		System.out.println("Displayed as flat file");
	}
	
}

class PngFile extends SysFile
{
	public PngFile(String file_name,String file_extn, long file_size) {
		super(file_name,"pngfile", file_size);
		
	}

	@Override
	public void displayFileInfo()
	{
		System.out.println("The file type is : PNG" );
	}
	
	public void fileBehavior() 
	{
		System.out.println("Displayed as image file with layers");
	}
	
}
class PdfFile extends SysFile
{
	public PdfFile(String file_name,String file_extn, long file_size) {
		super(file_name,"pdffile", file_size);
		
	}
	@Override
	public void displayFileInfo()
	{
		System.out.println("The File type is : PDF");
	}
	public void fileBehavior() 
	{
		System.out.println("Displayed as document with layers");
	}
}
class Photoshop { 
	public void openFile(SysFile fp)
	{
		fp.displayFileInfo();
		if(fp instanceof JpegFile) {
			((JpegFile)fp).fileBehaviour();
		}else if(fp instanceof PngFile) {
			((PngFile)fp).fileBehavior();
		}else if(fp instanceof PdfFile) {
			((PdfFile)fp).fileBehavior();
			
		}
	}
}


public class OperatingSystem { 
	
	public static void main(String[] args) {
		
		Photoshop ph = new Photoshop();
		
		JpegFile s = new JpegFile("Photo","jpg",1234);
		PngFile p = new PngFile("profile","png",7895);
        PdfFile pd = new PdfFile("Docs","pdf",5634);
//        
        ph.openFile(s);
        ph.openFile(p);
        ph.openFile(pd);
        
        


				
	}
	
}
