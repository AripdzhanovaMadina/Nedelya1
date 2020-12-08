import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class ZD4 {
    public static void main(String argc[]) {
        Main.NootepadWindow nootepad = new Main.NootepadWindow("MyNootepad", 1024, 1024);
    }

    public static class Main {
        public static class NootepadWindow extends JFrame implements ActionListener {
            Nootepad nootepad;

            JTextArea textArea;
            JMenuBar menuBar;

            JMenu mFile;
            JMenu mExit;
            JMenuItem miNew;
            JMenuItem miOpen;
            JMenuItem miSave;

            public NootepadWindow(String title, int width, int height) {
                nootepad = new Nootepad();

                setTitle(title);
                setSize(width, height);
                setLayout(new BorderLayout());
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                menuBar = new JMenuBar();
                textArea = new JTextArea();
                mFile = new JMenu("File");
                miNew = new JMenuItem("New");
                miOpen = new JMenuItem("Open");
                miSave = new JMenuItem("Save");
                mExit = new JMenu("Exit");

                miNew.addActionListener(this);
                miOpen.addActionListener(this);
                miSave.addActionListener(this);

                mFile.add(miNew);
                mFile.add(miSave);
                mFile.add(miOpen);

                menuBar.add(mFile);
                menuBar.add(mExit);

                setJMenuBar(menuBar);
                add(textArea, BorderLayout.CENTER);
                setVisible(true);
            }

            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(miNew))
                    nootepad.newFile();

                if (e.getSource().equals(miOpen))
                    textArea.setText(nootepad.openFile().toString());
                textArea.setText(new String(nootepad.openFile(), StandardCharsets.UTF_8));

                if (e.getSource().equals(miSave))
                    nootepad.saveFile(textArea.getText().getBytes());
            }

        }

        private static class Nootepad {
            private File currentFile;

            {
                Scanner input = new Scanner(System.in);
                SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
                Guest gstObject = new Guest();
                try {
                    System.out.println("Enter check-in date (dd/mm/yy):");
                    String cindate = input.nextLine();
                    if (null != cindate && cindate.trim().length() > 0) {
                        Date date1 = myFormat.parse(cindate);
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            File newFile() {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showSaveDialog(null);

                File file = new File(fileChooser.getSelectedFile().getPath());

                try {
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return file;
            }

            void saveFile(byte[] data) {
                try {
                    if (currentFile != null) {
                        currentFile.delete();
                        currentFile.createNewFile();
                    } else
                        currentFile = newFile();

                    FileOutputStream stream = new FileOutputStream(currentFile);
                    stream.write(data);
                    stream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            byte[] openFile() {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(null);
                currentFile = fileChooser.getSelectedFile();

                long lenghtFile = currentFile.length();
                byte[] fileBytes = new byte[(int) lenghtFile];

                try {
                    FileInputStream stream = new FileInputStream(currentFile);
                    stream.read(fileBytes);
                    stream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return fileBytes;
            }

            public File getCurrentFile() {
                return currentFile;
            }

            private class Guest {
            }
        }
    }
}
