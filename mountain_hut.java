
/**
 * Beschreiben Sie hier die Klasse mountain_hut.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class mountain_hut
{
    private Square sky;
    private Triangle mountain1;
    private Triangle mountain2;
    private Circle sun;
    private Square wall;
    private Triangle roof;

    public mountain_hut()
    {
        sky = new Square();
        drawSky();
        mountain1 = new Triangle();
        drawMountain1();
        mountain2 = new Triangle();
        drawMountain2();
        sun = new Circle();
        drawSun();
    }

    public void drawSky()
    {
        sky.makeVisible();
        sky.changeColor("skyBlue");
        sky.changeSize(300);
    }

    public void drawMountain1()
    {
        mountain1.makeVisible();
        mountain1.changeSize(150,300);
        mountain1.moveHorizontal(60);
        mountain1.moveVertical(150);
        mountain1.changeColor("grassGreen");
    }

    public void drawMountain2()
    {
        mountain2.makeVisible();
        mountain2.changeSize(200,300);
        mountain2.moveHorizontal(150);
        mountain2.moveVertical(100);
        mountain2.changeColor("grassGreen");
    }

    public void drawSun()
    {
        sun.makeVisible();
        sun.changeSize(50);
        sun.moveVertical(20);
        sun.moveHorizontal(200);
        sun.changeColor("yellow");
    }

}
