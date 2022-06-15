
import java.awt.Image;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author huanglinbao
 */
public class Employee {
    private String id;
    private String name;
    private String email;
    private String password;
    private String address;    
    private ImageIcon image;
    private Image img = null;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public void setImage(String image) throws MalformedURLException, IOException {
        URL url = new URL(image);
        img = ImageIO.read(url);
        this.image = new ImageIcon(img);
    }

    

    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", Name=" + name + ", Email=" + email + ", Password=" + password + ", description=" +"Address="+ address + "Image="+image+'}';
    }
    
    
}