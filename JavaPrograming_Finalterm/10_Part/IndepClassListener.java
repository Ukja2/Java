import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IndepClassListener extends JFrame {
    public IndepClassListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JButton btn = new JButton("Action"); // 버튼 객체 생성
        btn.addActionListener(new MyActionListener()); // Action 리스너 추가
        c.add(btn);
        
        setSize(350, 150); // 프레임 크기 설정
        setVisible(true); // 프레임 표시
    }

    public static void main(String[] args) {
        new IndepClassListener();
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b.getText().equals("Action")) {
            b.setText("액션"); // 버튼 텍스트 변경
        } else {
            b.setText("Action"); // 버튼 텍스트 복원
        }
    }
}
