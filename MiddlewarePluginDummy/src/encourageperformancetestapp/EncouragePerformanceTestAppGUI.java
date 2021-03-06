/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encourageperformancetestapp;

//import cister.rabbitmq.library.PerformanceTests;
import encourager.RabbitUtils;
import java.lang.invoke.MethodHandles;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
//import middlewareplugindummy.MiddlewarePluginDummy;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author cister
 */
public class EncouragePerformanceTestAppGUI extends javax.swing.JFrame
{

    private Thread performanceTestsThread = null;
    //public PerformanceTests performanceTests = new PerformanceTests();
    private String rabbitHost;
    private String rabbitVHost;
    private String rabbitUsername;
    private String rabbitPassword;
    private int numberOfMessages;
    private int intervalBetweenMessages;
    private String shadowDevice;
    private final int lowFrequencyStartHour = 8;
    private final int normalFrequencyStartHour = 16;
    private final int highFrequencyStartHour = 24;
    private String configurationFile;
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass().getName());

    /**
     * Creates new form EncouragePerformanceTestAppGUI
     *
     * @param configurationFileasd
     */
    public EncouragePerformanceTestAppGUI(String configurationFileasd)
    {
        logger.debug("CONSTRUTOR!");
        this.configurationFile = configurationFileasd;
    }

//    class RemindTask extends TimerTask
//    {
//        private Thread performanceTestsThread = null;
//        public PerformanceTests performanceTests = new PerformanceTests();
//        private String type;
//
//        public RemindTask(String type)
//        {
//            this.type = type;
//        }
//        
//        public void run()
//        {
//            System.out.println("Publishing");
//    
//            this.performanceTestsThread = new Thread(new Runnable()
//            {
//                @Override
//                public void run()
//                {
//                    // random device
//                    performanceTests.longXmlMeasureTest(rabbitUsername, rabbitPassword, rabbitHost, rabbitVHost, numberOfMessages, intervalBetweenMessages, shadowDevice);
//                }
//            });
//
//            // start the thread
//            this.performanceTestsThread.start();
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VirtualDevicesModule Performance Tester");

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encourageperformancetestapp/logo_cister.jpg"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encourageperformancetestapp/logo_inesctec.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/encourageperformancetestapp/logo_isep.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("DejaVu Sans", 3, 36)); // NOI18N
        jLabel8.setText("VDmodule Performance Tester");

        buttonGroup13.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Random Device");

        buttonGroup13.add(jRadioButton2);
        jRadioButton2.setText("Choose specific Device:");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                jRadioButton2ItemStateChanged(evt);
            }
        });

        jComboBox1.setEnabled(false);

        jLabel1.setText("Number of Messages:");

        jTextField1.setText("1");

        jLabel2.setText("Interval:");

        jTextField2.setText("10");

        jLabel3.setText("miliseconds");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel13.setText("Rabbit Host");

        jLabel14.setText("Rabbit VHost");

        jLabel15.setText("Rabbit User");

        jLabel16.setText("Rabbit Password");

        jTextField9.setText("192.168.60.170");

        jTextField10.setText("/");

        jTextField11.setText("guest");

        jTextField12.setText("guest");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jTextField11)
                    .addComponent(jTextField12))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset defaults");
        jButton2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Stop");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel8)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_jRadioButton2ItemStateChanged
    {//GEN-HEADEREND:event_jRadioButton2ItemStateChanged
//        if (evt.getStateChange() == 1)
//        {
//            // selected
//            jComboBox1.setEnabled(true);
//        }
//        else
//        {
//            jComboBox1.setEnabled(false);
//        }
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
    {//GEN-HEADEREND:event_jButton2ActionPerformed
//        jTextField9.setText("razekcloudserver.dyndns.org");
//        jTextField10.setText("/");
//        jTextField11.setText("guest");
//        jTextField12.setText("guest");
//        jRadioButton1.setSelected(true);
//        jTextField1.setText("1");
//        jTextField2.setText("10");
//        jComboBox1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
//        String validationMessage = "";
//        
//        // validations
//        if (jTextField1.getText().equals(""))
//        {
//            jTextField1.setText("1");
//            validationMessage += "Number of messages non-defined. Used default value: '1'\n\r\t";
//        }
//        if (jTextField9.getText().equals(""))
//        {
//            jTextField9.setText("razekcloudserver.dyndns.org");
//            validationMessage += "RabbitMQ Host non-defined. Used default value: 'razekcloudserver.dyndns.org'\n\r\t";
//        }
//        if (jTextField10.getText().equals(""))
//        {
//            jTextField10.setText("/");
//            validationMessage += "Rabbit VHost non-defined. Used default value: '/'\n\r\t";
//        }
//        if (jTextField11.getText().equals(""))
//        {
//            jTextField11.setText("guest");
//            validationMessage += "Rabbit User non-defined. Used default value: 'guest'\n\r\t";
//        }
//        if (jTextField12.getText().equals(""))
//        {
//            jTextField12.setText("guest");
//            validationMessage += "Rabbit Password non-defined. Used default value: 'guest'\n\r\t";
//        }
//
//        if (!validationMessage.equals(""))
//        {
//            JOptionPane.showMessageDialog(null, null, validationMessage, JOptionPane.WARNING_MESSAGE);
//        }
//        
//        // enable stop button and disable run button
//        jButton3.setEnabled(true);
//        jButton1.setEnabled(false);
//        
//        performanceTests.messagesHistory.clear();
//
//        if (jRadioButton1.isSelected())
//        {
//            this.performanceTestsThread = new Thread(new Runnable()
//            {
//                public void run()
//                {
//                    // random device
//                    performanceTests.longXmlMeasureTest(jTextField11.getText(), jTextField12.getText(), jTextField9.getText(), jTextField10.getText(), Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()));
//                }
//            });
//
//            // start the thread
//            this.performanceTestsThread.start();
//        }
//        else if (jRadioButton2.isSelected())
//        {
//            this.performanceTestsThread = new Thread(new Runnable()
//            {
//                public void run()
//                {
//                    // specific device
//                    performanceTests.longXmlMeasureTestByGUI(jTextField11.getText(), jTextField12.getText(), jTextField9.getText(), jTextField10.getText(), jComboBox1.getSelectedItem().toString(), Integer.parseInt(jTextField1.getText()), Integer.parseInt(jTextField2.getText()));
//                }
//            });
//
//            // start the thread
//            this.performanceTestsThread.start();            
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
    {//GEN-HEADEREND:event_jButton3ActionPerformed
//        // enable run button and disable stop button
//        jButton3.setEnabled(false);
//        jButton1.setEnabled(true);
//        
//        this.performanceTestsThread.interrupt();
//        if (this.performanceTestsThread.isInterrupted())
//        {
//            this.performanceTestsThread = null;
//            System.out.println("Process stopped!");
//        }
//        
//        String history = "History of published messages (DeviceId <-> Number of messages published):\n\n";
//        
//        if (!performanceTests.messagesHistory.isEmpty())
//        {
//            /*for (Map.Entry<String, Integer> entry : performanceTests.messagesHistory.entrySet())
//            {
//                String key = entry.getKey();
//                int value = entry.getValue();
//                history += key + " --> " + value + "\n";
//            }
//            history += "Total messages published: " + performanceTests.messagesHistory.size();*/
//            history += "Total messages published: " + performanceTests.messagesPublished;
//        }
//        else
//        {
//            history = "No messages were published!";
//        }
//        
//        JOptionPane.showMessageDialog(null, history, "History", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        EncouragePerformanceTestAppGUI encouragePerformanceTestAppGUI = new EncouragePerformanceTestAppGUI(args[0]);
        encouragePerformanceTestAppGUI.startApp();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void startApp()
    {
        logger.debug("APPLICATION!");
        
        logger.entry();
        logger.debug("Starting MiddlewarePluginDummy application...");
        
        Properties properties = RabbitUtils.loadPropertiesFile(this.configurationFile);

        this.rabbitHost = properties.getProperty("RabbitHost");
        this.rabbitVHost = properties.getProperty("RabbitVHost");
        this.rabbitUsername = properties.getProperty("RabbitUser");
        this.rabbitPassword = properties.getProperty("RabbitPassword");
        this.numberOfMessages = Integer.parseInt(properties.getProperty("NumberOfMessages"));
        this.intervalBetweenMessages = Integer.parseInt(properties.getProperty("IntervalBetweenMessages"));
        this.shadowDevice = properties.getProperty("ShadowDevice");
        
        logger.debug("Properties loaded:\nRabbitHost: " + rabbitHost + "\nRabbitVHost: " + rabbitVHost + "\nRabbitUsername: " + rabbitUsername + 
                                      "\nRabbitPassword: " + rabbitPassword + "\nNumberOfMessages: " + numberOfMessages + "\n IntervalBetweenMessages: " + intervalBetweenMessages + 
                                      "\n ShadowDevice: " + shadowDevice + "\n");
        
        if (this.intervalBetweenMessages == 1000)
            logger.debug("*** NEW PROFILE: Low Frequency - " + numberOfMessages + " each " + intervalBetweenMessages + " miliseconds ***");
        if (this.intervalBetweenMessages == 500)
            logger.debug("*** NEW PROFILE: Normal Frequency - " + numberOfMessages + " each " + intervalBetweenMessages + " miliseconds ***");
        if (this.intervalBetweenMessages == 100)
            logger.debug("*** NEW PROFILE: High Frequency - " + numberOfMessages + " each " + intervalBetweenMessages + " miliseconds ***");
        
        logger.debug("Subscribing to RabbitMQ to receive responses...");
        //MiddlewarePluginDummy teste = new MiddlewarePluginDummy();
//        try
//        {
//            teste.rabbit(this.rabbitUsername, this.rabbitPassword, this.rabbitHost, this.rabbitVHost);
//        } catch (Exception ex)
//        {
//            Logger.getLogger(EncouragePerformanceTestAppGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }

        this.performanceTestsThread = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    // random device
                    //performanceTests.longXmlMeasureTest(rabbitUsername, rabbitPassword, rabbitHost, rabbitVHost, numberOfMessages, intervalBetweenMessages, shadowDevice, null);
                }
                catch (Exception ex)
                {
                    Logger.getLogger(EncouragePerformanceTestAppGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        logger.debug("Starting performance tests thread...");
        // start the thread
        this.performanceTestsThread.start();

//        Calendar currentDate = new GregorianCalendar();
//        timerLowFrequency = new Timer();
//        timerLowFrequency.scheduleAtFixedRate(new RemindTask(), new GregorianCalendar(currentDate.get(Calendar.YEAR),
//                                                                          currentDate.get(Calendar.MONTH),
//                                                                          currentDate.get(Calendar.DATE),
//                                                                          lowFrequencyStartHour,
//                                                                          0).getTime(), fONCE_PER_DAY);
//        
//        timerNormalFrequency = new Timer();
//        timerNormalFrequency.scheduleAtFixedRate(new RemindTask(), new GregorianCalendar(currentDate.get(Calendar.YEAR),
//                                                                          currentDate.get(Calendar.MONTH),
//                                                                          currentDate.get(Calendar.DATE),
//                                                                          normalFrequencyStartHour,
//                                                                          0).getTime(), fONCE_PER_DAY);
//        
//        timerHighFrequency = new Timer();
//        timerHighFrequency.scheduleAtFixedRate(new RemindTask(), new GregorianCalendar(currentDate.get(Calendar.YEAR),
//                                                                          currentDate.get(Calendar.MONTH),
//                                                                          currentDate.get(Calendar.DATE),
//                                                                          highFrequencyStartHour,
//                                                                          0).getTime(), fONCE_PER_DAY);
    }
}
