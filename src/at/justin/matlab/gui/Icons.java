package at.justin.matlab.gui;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public enum Icons {
    // 0-16 pixels
    CHECK_10("check_10.png"),
    SEARCH_15("search_15.png"),
    TOOLBAR_DELETE_16("toolbar_delete_16.png"),

    CLASS_ECLIPSE("FileStructureSymbols/eclipse/class_obj.png"),
    CLASS_INTELLIJ("FileStructureSymbols/intellij/classTypeJavaClass.png"),

    METHOD_ECLIPSE("FileStructureSymbols/eclipse/methpub_obj.png"),
    METHOD_INTELLIJ("FileStructureSymbols/intellij/method.png"),
    PROPERTY_INTELLIJ("FileStructureSymbols/intellij/field.png"),

    METHOD_PRIVATE_ECLIPSE("FileStructureSymbols/eclipse/methpri_obj.png"),

    DECORATOR_PRIVATE_INTELLIJ("FileStructureSymbols/intellij/private.png"),
    DECORATOR_PUBLIC_INTELLIJ("FileStructureSymbols/intellij/public.png"),
    DECORATOR_STATIC_ECLIPSE("FileStructureSymbols/eclipse/static_co.png"),
    DECORATOR_STATIC_INTELLIJ("FileStructureSymbols/intellij/staticMark.png");

    private final ImageIcon icon;

    Icons(String filename) {
        this.icon = new ImageIcon(Icons.class.getResource("/icons/" + filename));
    }

    public Icon getIcon() {
        return this.icon;
    }

}
