package pixLab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("U:/git/picture-lab-Greitavi000/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("U:/git/picture-lab-Greitavi000/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorHorisontal()
  {
    Picture caterpillar = new Picture("U:/git/picture-lab-Greitavi000/images/temple.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("U:/git/picture-lab-Greitavi000/images/koala.jpg");
    caterpillar.explore();
    caterpillar.MirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("U:/git/picture-lab-Greitavi000/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("U:/git/picture-lab-Greitavi000/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("U:/git/picture-lab-Greitavi000/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("C:/Users/greitavi000/Downloads/IMG-3263.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue() {
	  Picture beach = new Picture("U:/git/picture-lab-Greitavi000/images/beach.jpg");
	    beach.explore();
	    beach.KeepOnlyBlue();
	    beach.explore();
  }
  
  public static void testKeepOnlyRed() {
	  Picture beach = new Picture("U:/git/picture-lab-Greitavi000/images/beach.jpg");
	    beach.explore();
	    beach.KeepOnlyRed();
	    beach.explore();
  }
  
  
  public static void testKeepOnlyGreen() {
	  Picture beach = new Picture("U:/git/picture-lab-Greitavi000/images/beach.jpg");
	    beach.explore();
	    beach.KeepOnlyGreen();
	    beach.explore();
  }
  
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
   // testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorisontal();
    //testMirrorTemple();
	  
	  //testMirrorArms();
    //testMirrorGull();
	 //testMirrorDiagonal();
	  
    //testCollage();
    //testCopy();
    //testEdgeDetection();
	 
   testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}