package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import com.jme3.scene.shape.Sphere;
import com.jme3.system.AppSettings;
import com.jme3.texture.Texture;


public class Main extends SimpleApplication {
    public Spatial spatialSol = null;
    public Spatial spatialMer = null;
    public Spatial spatialVenus = null;
    public Spatial spatialTierra = null;
    public Spatial spatialMarte = null;
    public Spatial spatialJupiter = null;
    
    public Spatial mercurioU = null;
    public Spatial venusU = null;
    public Spatial tierraU = null;
    public Spatial marteU = null;
    public Spatial jupiterU = null;
    
    
    public Spatial lunaTierra = null;
    
    public Spatial lunaU = null;

    public static void main(String[] args) {
        AppSettings settings = new AppSettings(true);
        settings.setTitle("Sistema Solar");
        settings.setSettingsDialogImage("Interface/sistemasolar.jpeg");
        settings.setResolution(1280, 960);
        Main app = new Main();
        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp() {
        //Creacion Sol
        Node nodoSol = new Node("nodoSol");
        Sphere sol = new Sphere(30, 30, 1);
        Geometry geoSol = new Geometry("Sphere", sol);

        Texture textureSol = assetManager.loadTexture("Textures/sol.jpg");
        Material matSol = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matSol.setTexture("ColorMap", textureSol);

        geoSol.setMaterial(matSol);
        nodoSol.attachChild(geoSol);
        rootNode.attachChild(nodoSol);
        
        //Creacion Mercurio
        Node nodoMercurio = new Node("nodoMercurio");
        Node nodoRotMercurio = new Node("nodoRotMercurio");
        Sphere mercurio = new Sphere(30, 30, 1);
        Geometry geoMercurio = new Geometry("geoMercurio", mercurio);

        Texture textureMercurio = assetManager.loadTexture("Textures/mercurio.jpg");
        Material matMercurio = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matMercurio.setTexture("ColorMap", textureMercurio);

        geoMercurio.setMaterial(matMercurio);
        geoMercurio.move(0, 0, 4);
        nodoRotMercurio.attachChild(geoMercurio);
        nodoMercurio.attachChild(nodoRotMercurio);
        rootNode.attachChild(nodoMercurio);
        
        //Creacion Venus
        Node nodoVenus = new Node("nodoVenus");
        Node nodoRotVenus = new Node("nodoRotVenus");
        Sphere venus = new Sphere(30, 30, 1);
        Geometry geoVenus = new Geometry("geoVenus", venus);

        Texture textureVenus = assetManager.loadTexture("Textures/venus.jpg");
        Material matVenus = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matVenus.setTexture("ColorMap", textureVenus);
        geoVenus.setMaterial(matVenus);
        geoVenus.move(1, 0, -7);
        
        nodoRotVenus.attachChild(geoVenus);
        nodoVenus.attachChild(nodoRotVenus);
        rootNode.attachChild(nodoVenus);
        
        //Creacion Tierra
        Node nodoTierra = new Node("nodoTierra");
        Node nodoRotTierra = new Node("nodoRotTierra");
        Sphere tierra = new Sphere(30, 30, 1);
        Geometry geoTierra = new Geometry("geoTierra", tierra);

        Texture textureTierra = assetManager.loadTexture("Textures/tierra.jpg");
        Material matTierra = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matTierra.setTexture("ColorMap", textureTierra);
        geoTierra.setMaterial(matTierra);
        geoTierra.move(0, 0, 0);
       
        //Creacion Luna
        Node nodoLuna = new Node("nodoLuna");
        nodoRotTierra.move(3, 0, -10);
        Sphere luna = new Sphere(30, 30, 0.1f);
        Geometry tierraLuna = new Geometry("tierraLuna", luna);
        
        Texture textureLuna = assetManager.loadTexture("Textures/luna.jpg");
        Material matLuna = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matLuna.setTexture("ColorMap", textureLuna);
        tierraLuna.setMaterial(matLuna);
        tierraLuna.move(0, 0, 2);
        
        rootNode.attachChild(nodoTierra);
        nodoTierra.attachChild(nodoRotTierra);
        nodoRotTierra.attachChild(geoTierra);
        nodoRotTierra.attachChild(nodoLuna);
        nodoLuna.attachChild(tierraLuna);
        
        //Creacion Marte
        Node nodoMarte = new Node("nodoMarte");
        Node nodoRotMarte = new Node("nodoRotMarte");
        Sphere Marte = new Sphere(30, 30, 1);
        Geometry geoMarte = new Geometry("geoMarte", Marte);

        Texture textureMarte = assetManager.loadTexture("Textures/marte.jpg");
        Material matMarte = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matMarte.setTexture("ColorMap", textureMarte);
        geoMarte.setMaterial(matMarte);
        geoMarte.move(3, 0, -19);
        
        nodoRotMarte.attachChild(geoMarte);
        nodoMarte.attachChild(nodoRotMarte);
        rootNode.attachChild(nodoMarte);
        
        //Creacion Jupiter
        Node nodoJupiter = new Node("nodoJupiter");
        Node nodoRotJupiter = new Node("nodoRotJupiter");
        Sphere jupiter = new Sphere(30, 30, 1);
        Geometry geoJupiter = new Geometry("geoJupiter", jupiter);

        Texture textureJupiter = assetManager.loadTexture("Textures/jupiter.jpg");
        Material matJupiter = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        matJupiter.setTexture("ColorMap", textureJupiter);
        geoJupiter.setMaterial(matJupiter);
        geoJupiter.move(0, 0, -22);
        
        nodoRotJupiter.attachChild(geoJupiter);
        nodoJupiter.attachChild(nodoRotJupiter);
        rootNode.attachChild(nodoJupiter);
      
        flyCam.setMoveSpeed(20);
        
    }

    @Override
    public void simpleUpdate(float tpf) {
        //Rotaciones al sol
        spatialMer = rootNode.getChild("nodoMercurio");
        spatialSol = rootNode.getChild("nodoSol");
        spatialVenus = rootNode.getChild("nodoVenus");
        spatialTierra = rootNode.getChild("nodoTierra");  
        spatialMarte = rootNode.getChild("nodoMarte"); 
        spatialJupiter = rootNode.getChild("nodoJupiter"); 
        
        spatialMer.rotate(0, tpf/4, 0);
        spatialSol.rotate(0, tpf, 0);
        spatialVenus.rotate(0, tpf/8, 0);
        spatialTierra.rotate(0, tpf/3, 0);
        spatialMarte.rotate(0, tpf/2, 0);
        spatialJupiter.rotate(0, tpf/5, 0);
        
        //Rotaciones unicas
        //Mercurio
        Node mercurioParent = (Node) rootNode.getChild("nodoMercurio");
        if (mercurioParent != null) {
            mercurioU = mercurioParent.getChild("geoMercurio");
            if (mercurioU != null) {
                mercurioU.rotate(0, tpf, 0);
            }
        }
        
        //Venus
        Node venusParent = (Node) rootNode.getChild("nodoVenus");
        if (venusParent != null) {
            venusU = venusParent.getChild("geoVenus");
            if (venusU != null) {
                venusU.rotate(0, tpf/8, 0);
            }
        }
        
        //Tierra
        Node tierraParent = (Node) rootNode.getChild("nodoTierra");
        if (tierraParent != null) {
            tierraU = tierraParent.getChild("geoTierra");
            if (tierraU != null) {
                tierraU.rotate(0, tpf/2, 0);
                Node lunaParent = (Node) tierraParent.getChild("nodoRotTierra");
                if (lunaParent != null){
                    lunaTierra = lunaParent.getChild("nodoLuna");
                    lunaTierra.rotate(0, -tpf, 0);
                    lunaU = lunaParent.getChild("tierraLuna");
                    lunaU.rotate(0, -tpf, 0);
                }
           }
        }
        //Marte
        Node marteParent = (Node) rootNode.getChild("nodoMarte");
        if (marteParent != null) {
            marteU = marteParent.getChild("geoMarte");
            if (marteU != null) {
                marteU.rotate(0, tpf/2, 0);
            }
        }
        
        //Jupiter
        Node jupiterParent = (Node) rootNode.getChild("nodoJupiter");
        if (jupiterParent != null) {
            jupiterU = jupiterParent.getChild("geoJupiter");
            if (jupiterU != null) {
                jupiterU.rotate(0, tpf/5, 0);
            }
        }  
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}