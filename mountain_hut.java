
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
    private Square door1;
    private Square door2;
    private Square window;

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
        wall = new Square();
        drawWall();
        roof = new Triangle();
        drawRoof();
        door1 = new Square();
        drawDoor1();
        door2 = new Square();
        drawDoor2();
        window = new Square();
        drawWindow();
    }

    public void drawSky()
    {
        sky.makeVisible();
        sky.changeColor("lightBlue");
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

    public void drawWall()
    {
        wall.makeVisible();
        wall.moveVertical(200);
        wall.moveHorizontal(130);
        wall.changeSize(50);
        wall.changeColor("brown");
    }

    public void drawRoof()
    {
        roof.makeVisible();
        roof.moveVertical(167);
        roof.moveHorizontal(135);
        roof.changeSize(40,60);
        roof.changeColor("black");
    }

    public void drawDoor1()
    {
        door1.makeVisible();
        door1.moveVertical(230);
        door1.moveHorizontal(139);
        door1.changeSize(13);
        door1.changeColor("darkBrown");
    }
    
    public void drawDoor2()
    {
        door2.makeVisible();
        door2.moveVertical(237);
        door2.moveHorizontal(139);
        door2.changeSize(13);
        door2.changeColor("darkBrown");
    }
    
    public void drawWindow()
    {
        window.makeVisible();
        window.moveVertical(230);
        window.moveHorizontal(160);
        window.changeSize(13);
        window.changeColor("lightBlue");
    }
}
