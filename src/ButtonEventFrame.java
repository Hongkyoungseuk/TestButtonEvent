import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class ButtonEventFrame extends Frame implements ActionListener {
    
    int count = 0;
    ButtonEventFrame() {
        // 테스트 프레임 크기
        this.setSize(200, 200);

        Button button1 = new Button();
        Button button2 = new Button();
        button1.setBounds(getWidth() / 2 - 50, 30, 100, 40);
        button1.setLabel("Click_1!!!");
        button2.setBounds(getWidth() / 2 - 50, 100, 100, 40);
        button2.setLabel("Click_2!!!");
        // ActionEvent 리스너를 등록
        button1.addActionListener(this);
        add(button1);
        button2.addActionListener(this);
        add(button2);
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // todo
        e.getModifiers();

        System.out.println("Button : " + e + " " + ++count);
    }
}