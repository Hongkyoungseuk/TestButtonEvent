import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import java.awt.event.ActionListener;

public class ButtonEventFrame extends Frame implements ActionListener {
    /**
     *
     */
    ButtonEventFrame() {
        // 테스트 프레임 크기
        this.setSize(200, 100);
        Button button = new Button();
        button.setBounds(getWidth() / 2 - 50, 30, 100, 40);
        button.setLabel("Click!!!");
        // ActionEvent 리스너를 등록
        button.addActionListener(this);
        add(button);
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button : " + e);
    }
}