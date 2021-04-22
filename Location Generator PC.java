import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zalty {

	private JFrame frame;
	private JTextField name;
	private JTextField description;
	private JTextField climate;
	private JTextField biome;
	private JTextField features;
	private JTextField natives;
	private JTextField life;
	private JTextField threat;
	private JTextArea output;
	private JTextField north;
	private JTextField northEast;
	private JTextField east;
	private JTextField southEast;
	private JTextField south;
	private JTextField southWest;
	private JTextField west;
	private JTextField northWest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zalty window = new Zalty();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Zalty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1013, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 82, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Description:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 44, 82, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Climate");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 77, 82, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Biome:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 114, 82, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Surroundings");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(765, 11, 136, 39);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Features:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 147, 82, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Native:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(10, 183, 82, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Life:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(10, 217, 82, 22);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Threat:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(10, 249, 82, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		name = new JTextField();
		name.setBounds(100, 13, 574, 20);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		description = new JTextField();
		description.setColumns(10);
		description.setBounds(102, 46, 572, 20);
		frame.getContentPane().add(description);
		
		climate = new JTextField();
		climate.setColumns(10);
		climate.setBounds(102, 79, 572, 20);
		frame.getContentPane().add(climate);
		
		biome = new JTextField();
		biome.setColumns(10);
		biome.setBounds(100, 116, 574, 20);
		frame.getContentPane().add(biome);
		
		features = new JTextField();
		features.setColumns(10);
		features.setBounds(102, 149, 572, 20);
		frame.getContentPane().add(features);
		
		natives = new JTextField();
		natives.setColumns(10);
		natives.setBounds(100, 185, 574, 20);
		frame.getContentPane().add(natives);
		
		life = new JTextField();
		life.setColumns(10);
		life.setBounds(102, 219, 572, 20);
		frame.getContentPane().add(life);
		
		threat = new JTextField();
		threat.setColumns(10);
		threat.setBounds(100, 251, 574, 20);
		frame.getContentPane().add(threat);
		
		output = new JTextArea();
		output.setBounds(10, 323, 664, 151);
		frame.getContentPane().add(output);
		output.setColumns(10);
		output.setLineWrap(true);
		
		JLabel lblNewLabel_9 = new JLabel("North");
		lblNewLabel_9.setBounds(695, 82, 46, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("North East");
		lblNewLabel_9_1.setBounds(695, 119, 59, 14);
		frame.getContentPane().add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_9_2 = new JLabel("East");
		lblNewLabel_9_2.setBounds(695, 156, 46, 14);
		frame.getContentPane().add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_9_3 = new JLabel("Souh East");
		lblNewLabel_9_3.setBounds(695, 192, 59, 14);
		frame.getContentPane().add(lblNewLabel_9_3);
		
		JLabel lblNewLabel_9_4 = new JLabel("South");
		lblNewLabel_9_4.setBounds(695, 228, 46, 14);
		frame.getContentPane().add(lblNewLabel_9_4);
		
		JLabel lblNewLabel_9_5 = new JLabel("South West");
		lblNewLabel_9_5.setBounds(695, 262, 59, 14);
		frame.getContentPane().add(lblNewLabel_9_5);
		
		JLabel lblNewLabel_9_6 = new JLabel("West");
		lblNewLabel_9_6.setBounds(695, 294, 46, 14);
		frame.getContentPane().add(lblNewLabel_9_6);
		
		JLabel lblNewLabel_9_7 = new JLabel("North West");
		lblNewLabel_9_7.setBounds(695, 327, 59, 14);
		frame.getContentPane().add(lblNewLabel_9_7);
		
		north = new JTextField();
		north.setBounds(765, 79, 222, 20);
		frame.getContentPane().add(north);
		north.setColumns(10);
		
		northEast = new JTextField();
		northEast.setColumns(10);
		northEast.setBounds(764, 116, 223, 20);
		frame.getContentPane().add(northEast);
		
		east = new JTextField();
		east.setColumns(10);
		east.setBounds(765, 153, 222, 20);
		frame.getContentPane().add(east);
		
		southEast = new JTextField();
		southEast.setColumns(10);
		southEast.setBounds(765, 189, 222, 20);
		frame.getContentPane().add(southEast);
		
		south = new JTextField();
		south.setColumns(10);
		south.setBounds(765, 225, 222, 20);
		frame.getContentPane().add(south);
		
		southWest = new JTextField();
		southWest.setColumns(10);
		southWest.setBounds(765, 259, 222, 20);
		frame.getContentPane().add(southWest);
		
		west = new JTextField();
		west.setColumns(10);
		west.setBounds(765, 291, 222, 20);
		frame.getContentPane().add(west);
		
		northWest = new JTextField();
		northWest.setColumns(10);
		northWest.setBounds(765, 324, 222, 20);
		frame.getContentPane().add(northWest);
		
		JLabel lblNewLabel_10 = new JLabel("Output");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(212, 282, 203, 30);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("⇒");
		lblNewLabel_11.setBounds(709, 27, 46, 14);
		frame.getContentPane().add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("Create \r\nLocation");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tempData="";
				tempData=name.getText()+":[";
				if (description.getText().isEmpty() ==false) {
					tempData+=" DESC: " + description.getText();
				}
				if (climate.getText().isEmpty() ==false) {
					tempData+="; CLIM<"+name.getText()+">: "+climate.getText();
				}
				if (biome.getText().isEmpty() ==false) {
					tempData+="; BIOME: "+biome.getText();
				}
				if (north.getText().length() !=0 || northEast.getText().length() !=0 ||
			            east.getText().length() !=0 || southEast.getText().length() !=0 ||
			            south.getText().length() !=0 || southWest.getText().length() !=0 ||
			            west.getText().length() !=0 || northWest.getText().length() !=0) {
			            tempData+="; EXIT:";
			        }
				if (north.getText().isEmpty() ==false) {
					tempData+=" <N⇒"+north.getText()+">";
				}
				if (northEast.getText().isEmpty() == false) {
					tempData+=" <NE⇒"+northEast.getText()+">";
				}
				if (east.getText().isEmpty() == false) {
					tempData+=" <E⇒"+east.getText()+">";
				}
				if (southEast.getText().isEmpty() == false) {
					tempData+=" <S⇒"+southEast.getText()+">";
				}
				if (south.getText().isEmpty() == false) {
					tempData+=" <S⇒"+south.getText()+">";
				}
				if (southWest.getText().isEmpty() == false) {
					tempData+=" <SW⇒"+southWest.getText()+">";
				}
				if (west.getText().isEmpty() == false) {
					tempData+=" <W⇒"+west.getText()+">";
				}
				if (northWest.getText().isEmpty() == false) {
					tempData+=" <NW⇒"+northWest.getText()+">";
				}
				if (features.getText().isEmpty() == false) {
					tempData+="; FEATURES<"+name.getText()+">: "+features.getText();
				}
				if (natives.getText().isEmpty() == false) {
					tempData+="; NATIVE: "+natives.getText();
				}
				if (life.getText().isEmpty() == false) {
					tempData+="; LIFE: "+life.getText();
				}
				if (threat.getText().isEmpty() == false) {
					tempData+="; THRE: "+threat.getText();
				}
				tempData+=".]";
				output.setText(tempData);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 37));
		btnNewButton.setBounds(695, 357, 292, 50);
		frame.getContentPane().add(btnNewButton);
		
		JButton delete = new JButton("Clear all inputs");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				description.setText("");
				climate.setText("");
				biome.setText("");
				features.setText("");
				natives.setText("");
				life.setText("");
				threat.setText("");
				north.setText("");
				northEast.setText("");
				east.setText("");
				southEast.setText("");
				south.setText("");
				southWest.setText("");
				west.setText("");
				northWest.setText("");
			}
		});
		delete.setFont(new Font("Tahoma", Font.PLAIN, 37));
		delete.setBounds(695, 424, 292, 50);
		frame.getContentPane().add(delete);
	}
}
//Greenbriar Hills:[ 
//DESC: hilly_region; 
//CLIM<Greenbriar Hills>: temperate; 
//BIOME: hilly forests large_river:SW<from_mountain>⇒E; 
//EXIT: <NW⇒Yrthwood> <E⇒The Sunless Basin> <SW⇒mountains:Teeth of Gwahlur>; 
//FEATURES<Greenbriar Hills>: prickly_plants strange_lights_at_night<'Old Light'>; 
//NATIVE: lizardfolk<friendly tribal> halflings<prosperous_village:'Greenbriar'>; 
//LIFE: varied giant_lizards<in_river> crested_birds; 
//THRE: wolves<minor>.]