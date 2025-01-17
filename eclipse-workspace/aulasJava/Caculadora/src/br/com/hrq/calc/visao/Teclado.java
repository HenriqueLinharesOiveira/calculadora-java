package br.com.hrq.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.hrq.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {
	
	private final Color CINZA_ESCURO = new Color(69,69,69);
	private final Color CINZA_CLARO = new Color(126,129,130);
	private final Color AZUL_RIO = new Color(12	,139,146);
	
	public Teclado() {
		setLayout(new GridLayout(4,5));
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		  
		//linha 1
		c.gridwidth = 2;
		adicionarBotao("AC", CINZA_CLARO, c, 0,0);
		c.gridwidth = 1;
		adicionarBotao("±", CINZA_ESCURO, c, 2,0);
		adicionarBotao("/", AZUL_RIO, c, 3,0);
		
		//linha2
		adicionarBotao("7", CINZA_ESCURO, c, 0,1);
		adicionarBotao("8", CINZA_ESCURO, c, 1,1);
		adicionarBotao("9", CINZA_ESCURO, c, 2,1);
		adicionarBotao("X", AZUL_RIO, c, 3,1);
		
		//linha3
		adicionarBotao("4", CINZA_ESCURO, c, 0,2);
		adicionarBotao("5", CINZA_ESCURO, c, 1,2);
		adicionarBotao("6", CINZA_ESCURO, c, 2,2);
		adicionarBotao("-", AZUL_RIO, c, 3,2);
		
		//linha4
		adicionarBotao("1", CINZA_ESCURO, c, 0,3);
		adicionarBotao("2", CINZA_ESCURO, c, 1,3);
		adicionarBotao("3", CINZA_ESCURO, c, 2,3);
		adicionarBotao("+", AZUL_RIO, c, 3,3);
		
		//linha5
		c.gridwidth = 2;
		adicionarBotao("0", CINZA_ESCURO, c, 0,4);
		c.gridwidth = 1;
		adicionarBotao(",", CINZA_ESCURO, c, 2,4);
		adicionarBotao("=", AZUL_RIO, c, 3,4);	
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {		
			JButton botao = (JButton) e.getSource();
			System.out.println(botao.getText());
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
	
}
