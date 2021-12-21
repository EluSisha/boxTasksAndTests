import java.io.*;

public class Main {

    private static final String WTF_BUT_NEED1 = "LISTEN TO MEEEE I AM MR.MEESEEKS";
    private static final String WTF_BUT_NEED2 = "DO NOT PUSH THE BUTTON!!!";
    private static final String WTF_BUT_NEED3 = "DO NOT PUSH THE BUTTON Please!!!";
    private static final String WTF_BUT_NEED4 = "DO NOT PUSH THE BUTTON oh fuck u touched?!!!";
    private static final String WTF_BUT_NEED5 = "GG WP!!!";

    private static final String BOX_CONTENT_FILENAME = "box.data";

    public static void main(String[] args) throws IOException {
//        final Box myBox = new Box("motherfucker", 5, "Hi my name is motherfucker", "Hi my name is useless");
//        save(myBox);

        final Box box = loadBox();

        /*System.out.printf("Box with a name %s and priority %d have next content %s",
                box.getTitle(),
                box.getPriority(),
                box.getContent());*/

        System.out.println(box);

    }

    private static boolean save(Box box) {

        try (FileOutputStream fos = new FileOutputStream(BOX_CONTENT_FILENAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(box);

            return true;
        } catch (IOException e) {
            return false;
        }
    }

    private static Box loadBox() {
        try (FileInputStream fis = new FileInputStream(BOX_CONTENT_FILENAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            final Object obj = ois.readObject();
            Box result = (Box) obj;
            return result;
        } catch (IOException | ClassNotFoundException e1) {
            return null;
        }
    }

    private static String readFile(String fileName){
        try (FileInputStream fis = new FileInputStream(fileName); // закрытие потока происходит автоматически
             BufferedReader br = new BufferedReader(new InputStreamReader(fis))) {

            StringBuilder stringBuilder = new StringBuilder();

            String tmp;

            while((tmp = br.readLine()) != null) {
                stringBuilder
                        .append(tmp)
                        .append("\n");
            }


            return stringBuilder.toString();

        } catch (FileNotFoundException e) {
            return "File was not found or access to it is restricted";
        } catch (IOException e1) {
            return "NOnonon";
        }

    }

    private static void writeToFile(String fileName, String ... content) {
        try (OutputStream fos = new FileOutputStream(fileName);
             PrintWriter pw = new PrintWriter(fos)) {

            for (String line : content) {
                pw.println(line);
            }


        } catch (FileNotFoundException e) {
            System.out.printf("File \"%s\" was not found or access to it is restricted", fileName);
        } catch (IOException e1) {
            System.out.println("Failed to write info to file");
        }
    }
}
