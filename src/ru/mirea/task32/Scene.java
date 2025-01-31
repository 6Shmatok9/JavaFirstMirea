package ru.mirea.task32;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class Scene
{
    public Scene(String path, HashMap<String, Integer> actResp, LinkedList<Item> inventory) throws IOException
    {
        image = ImageIO.read(new File(path));
        this.actResp = actResp;
        this.inventory = inventory;
    }

    public Integer getResponse(String action)
    {
        if (actResp.containsKey(action))
            return(actResp.get(action));
        else
            return(-1);
    }

    public BufferedImage image;
    HashMap<String, Integer> actResp;
    public LinkedList<Item> inventory;
}
