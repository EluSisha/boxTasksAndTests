import java.io.Serializable;

public class Box implements Serializable {

    private static final long serialVersionUID = 123122L;

    private String title;
    private int priority;
    private String content;
    //private transient String unimportantString;
    private String unimportantString;

    public Box(String title, int priority, String content) {
        this.title = title;
        this.priority = priority;
        this.content = content;
    }

    public Box(String title, int priority, String content, String unimportantString) {
        this.title = title;
        this.priority = priority;
        this.content = content;
        this.unimportantString = unimportantString;
    }

    public Box() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getContent() {
        return content;
    }

    public String getUnimportantString() {
        return unimportantString;
    }

    public void setUnimportantString(String unimportantString) {
        this.unimportantString = unimportantString;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "title='" + title + '\'' +
                ", priority=" + priority +
                ", content='" + content + '\'' +
                ", unimportantString='" + unimportantString + '\'' +
                '}';
    }
}