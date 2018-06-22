
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.Vector;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;


public class CreateChart extends javax.swing.JFrame {
    
    public CreateChart() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);    

    }

    public CreateChart(String appTitle,String chartTitle)
    {
        Connection c = new Connection();
        DBCollection dbc = c.connection("Analysis");
//        DBCollection dbc1 = c.connection("Package");
//        
//        Vector v = new java.util.Vector();
//        
//        DBCursor dc = dbc1.find();
//        
//        for(int i =0 ; i<8;i++)
//        {
//            String g = "";
//            while(dc.hasNext())
//            {
//                DBObject obj = dc.next();
//                g = (String) obj.get("Pid");
//            }
//            v.add(g);
//        }
        
        BasicDBObject bdb = new BasicDBObject();
        bdb.put("Packid","1");
        DBCursor cursor = dbc.find(bdb);
        int a=cursor.count();
        
        BasicDBObject bdb1 = new BasicDBObject();
        bdb1.put("Packid","2");
        DBCursor cursor1 = dbc.find(bdb1);
        int b=cursor1.count();
        
        BasicDBObject bdb2 = new BasicDBObject();
        bdb2.put("Packid","3");
        DBCursor cursor2 = dbc.find(bdb2);
        int d=cursor2.count();
        
        BasicDBObject bdb3 = new BasicDBObject();
        bdb3.put("Packid","4");
        DBCursor cursor3 = dbc.find(bdb3);
        int e=cursor3.count();
        
        BasicDBObject bdb4 = new BasicDBObject();
        bdb4.put("Packid","5");
        DBCursor cursor4 = dbc.find(bdb4);
        int f=cursor4.count();

        PieDataset dataset = createDataset(a,b,d,e,f);
        JFreeChart chart = CreateChart(dataset, chartTitle);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500,300));
        setContentPane(chartPanel);
    }
    
    private PieDataset createDataset(int a,int b,int d,int e,int f)
    {
        DefaultPieDataset result = new DefaultPieDataset();
        result.setValue("A", a);
        result.setValue("B", b);
        result.setValue("C", d);
        result.setValue("D", e);
        result.setValue("E", f);
        return result;
    }
    
    private JFreeChart CreateChart(PieDataset dataset,String title)
    {
        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset,true,true,true);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(1f);
        return chart;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analysis Chart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}