/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package segundaparteproy;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.RowFilter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import segundaparteproy.Pelicula;

/**
 *
 * @author JOSE
 */
public class PrincipalPelicula extends javax.swing.JFrame {
    //usamos pilas.
    public Deque<Pelicula> ListPelicula; 
    public Hashtable<Integer, Pelicula> hashTablePelicula = new Hashtable<>();
    //instanciamos
    ColaLinkedList colaList = new ColaLinkedList();
    List<Pelicula> pruebaPelicula = new ArrayList<>();
    //Filtro es para busacar 
    /*private TableRowSorter trsfiltro;
    String filtro;*/
   
    
    public PrincipalPelicula() {
        initComponents();
        this.setLocationRelativeTo(this);
        //Llamamos a ListPelicula
        ListPelicula = new LinkedList<>();
        //No aparece
        btnDelete.setVisible(false);
        this.añadirPeliculas();
     
    }
    
    
    ///funcion llamar jdialogo
      public void intanciarPanelPeliculas() {

        //DefaultTableModel get_table = (DefaultTableModel) table_student.getModel();
        //   int user_dni = Integer.parseInt(get_table.getValueAt(selected_row, selected_column).toString());
        PanelPeliculas editing_user = new PanelPeliculas(this, rootPaneCheckingEnabled, this.hashTablePelicula);
        editing_user.setModal(true);
        editing_user.setVisible(true);

        editing_user.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

    }
    
    
    
    //FUNCION BUSCAR POR CODIGO:
    public Pelicula buscarPorCodigo(int filtro) {
        List list = (LinkedList) ListPelicula;
        Pelicula pelicula = null;
        //creamos variables y la inicializamos
        boolean encontrado = false;
        int i = 0;

        for (Object peliculas : list)
        {
            pelicula = (Pelicula) peliculas;
            //condicion
            if (pelicula.getCodigo() == filtro) {
                System.out.println(pelicula.getCodigo() + " codiguito");
                encontrado = true;
                break;
            } else {
                //incrementamos en 1 la variable i
                i++;
            }
        }
        //condicion
        if (encontrado) {          
           return pelicula;
        } else {
            //System.err.println("Pelicula no encontrado");
            Pelicula PeliculaVacia = new Pelicula(0, "", 0, "", "", "", "");
            return PeliculaVacia;
        }
    }

   /* public void buscarCodigo() {
        int codigo = Integer.parseInt(txtFiltro.getText());
    }*/
    public Pelicula buscarPorNombre(String filtro)
    {
        List list = (LinkedList)ListPelicula;
        Pelicula pelicula = null;
        //creamos variables y la inicializamos
        boolean encontrado = false;
        int i = 0;
        for(Object peliculas : list){
            
           pelicula = (Pelicula) peliculas;
            //condicion
            if(pelicula.getNombre().compareToIgnoreCase(filtro) == 0) {     
                System.out.println(pelicula.getNombre());
                encontrado = true;
                break;
            }else{
                //incrementamos en 1 la variable i
                i++;
            }    
        }
        //condicion
        if(encontrado)
        {     
            return pelicula;
        }else
        {
            //System.err.println("Pelicula no encontrado");
             Pelicula PeliculaVacia = new Pelicula(0, "", 0, "","","", "");
            return PeliculaVacia;
        }
    }
   /* public void buscarNombre() {
        String nombre = txtFiltro.getText();

    }*/
    public void listar(){
      
        DefaultTableModel model = (DefaultTableModel) tablaResultado.getModel();
        model.setRowCount(0);

        for(Pelicula peliculita : ListPelicula){    
            int codigo = peliculita.getCodigo();
            String nombre = peliculita.getNombre();
            int año = peliculita.getAño();
            String clasificacion = peliculita.getClasificacion();
            String duracion = peliculita.getDuracion();
            String resolucion = peliculita.getResolucion();    
            String imagen = peliculita.getImagen(); 
            Object[] data = {codigo, nombre, año, clasificacion, duracion, resolucion, imagen};
            //se agrega en un fila
            model.addRow(data);
        }
        
    }
    
    public void limpiar(){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtAño.setText("");
        txtClasificacion.setText("");
        txtDuracion.setText("");
        txtResolucion.setText("");
    }
    private void AgregarHash(Pelicula pelicula){
        
       this.hashTablePelicula.put(pelicula.getCode(), pelicula);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtClasificacion = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        txtResolucion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnBuscarPalabra = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        btnAlquilar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        imagenDireccion = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        setLocationByPlatform(true);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Año:");

        jLabel4.setText("Clasificacion:");

        jLabel5.setText("Duracion");

        jLabel6.setText("Resolucion:");

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar (1).png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setMaximumSize(new java.awt.Dimension(589, 518));
        btnAgregar.setMinimumSize(new java.awt.Dimension(589, 518));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Año", "Clasificacion", "Duracion", "Resolucion", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaResultado);

        jLabel7.setText("Peliculas:");

        btnBuscarPalabra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/filtrar.png"))); // NOI18N
        btnBuscarPalabra.setText("Filtrar");
        btnBuscarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPalabraActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar (1).png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/listar (1).png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnAlquilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/alquilarpelicula (1).png"))); // NOI18N
        btnAlquilar.setText("ALQUILAR PELICULA");
        btnAlquilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlquilarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N

        jButton1.setText("Seleccionar Foto gaaaaaaaaaaa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Imagen");

        imagenDireccion.setText("...");

        jButton2.setText("MOSTRAR CATALOGO PELICULAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 355, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtNombre)
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtResolucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                                .addComponent(txtDuracion, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(imagenDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtAño)
                                            .addComponent(txtClasificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jButton1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnListar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(btnBuscarPalabra)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(37, 37, 37))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAlquilar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListar)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jLabel10))
                    .addComponent(imagenDireccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPalabra))
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addGap(127, 127, 127))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void añadirPeliculas(){
        //Pelicula pelicula = new Pelicula();
        int codigo, año;
        String nombre, clasificacion, duracion, resolucion, imagen;
        
        
              Pelicula pelicula1 = new Pelicula();
        pelicula1.setCodigo(1);
        pelicula1.setNombre("Nemo");
        pelicula1.setAño(2011);
        pelicula1.setClasificacion("APT");
        pelicula1.setDuracion("2H 5MIN");
        pelicula1.setResolucion("4K");
        pelicula1.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\nemo.jpg");

        Pelicula pelicula2 = new Pelicula();
        pelicula2.setCodigo(2);
        pelicula2.setNombre("Dory");
        pelicula2.setAño(2012);
        pelicula2.setClasificacion("APT");
        pelicula2.setDuracion("1H 45MIN");
        pelicula2.setResolucion("4K");
        pelicula2.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\dory.jpg");

        Pelicula pelicula3 = new Pelicula();
        pelicula3.setCodigo(3);
        pelicula3.setNombre("La Llorona");
        pelicula3.setAño(2009);
        pelicula3.setClasificacion("+18");
        pelicula3.setDuracion("2H 25MIN");
        pelicula3.setResolucion("HD");
        pelicula3.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\lallorona.jpg");
        
        Pelicula pelicula4 = new Pelicula();
        pelicula4.setCodigo(4);
        pelicula4.setNombre("Chuky");
        pelicula4.setAño(2007);
        pelicula4.setClasificacion("+18");
        pelicula4.setDuracion("2H 15MIN");
        pelicula4.setResolucion("HD");
        pelicula4.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\chuky.jpg");
        
        Pelicula pelicula5 = new Pelicula();
        pelicula5.setCodigo(5);
        pelicula5.setNombre("Asu mare");
        pelicula5.setAño(2007);
        pelicula5.setClasificacion("APT");
        pelicula5.setDuracion("1H 45MIN");
        pelicula5.setResolucion("HD");
        pelicula5.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\asu mare.jpg");
        
        Pelicula pelicula6 = new Pelicula();
        pelicula6.setCodigo(6);
        pelicula6.setNombre("Thor");
        pelicula6.setAño(2018);
        pelicula6.setClasificacion("+18");
        pelicula6.setDuracion("2H 5MIN");
        pelicula6.setResolucion("HD");
        pelicula6.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\thor.jpg");
        
        Pelicula pelicula7 = new Pelicula();
        pelicula7.setCodigo(7);
        pelicula7.setNombre("Los Increibles");
        pelicula7.setAño(2009);
        pelicula7.setClasificacion("APT");
        pelicula7.setDuracion("2H 00MIN");
        pelicula7.setResolucion("HD");
        pelicula7.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\losincreibles.jpg");
        
        Pelicula pelicula8 = new Pelicula();
        pelicula8.setCodigo(8);
        pelicula8.setNombre("Corazon de padre");
        pelicula8.setAño(2009);
        pelicula8.setClasificacion("APT");
        pelicula8.setDuracion("1H 30MIN");
        pelicula8.setResolucion("HD");
        pelicula8.setImagen("C:\\Users\\joxhe\\OneDrive\\Documentos\\NetBeansProjects\\proyectoutp\\src\\imagenesPeliculas\\corazon.jpg");
        
        this.colaList.deque(pelicula1);
        this.colaList.deque(pelicula2);
        this.colaList.deque(pelicula3);
        this.colaList.deque(pelicula4);
        this.colaList.deque(pelicula5);
        this.colaList.deque(pelicula6);
        this.colaList.deque(pelicula7);
        this.colaList.deque(pelicula8);     
        
        this.ListPelicula = this.colaList.returnListElements();
        //this.pruebaPelicula.add(pelicula);
        AgregarHash(pelicula1);
        AgregarHash(pelicula2);
        AgregarHash(pelicula3);
        AgregarHash(pelicula4);
        AgregarHash(pelicula5);
        AgregarHash(pelicula6);
        AgregarHash(pelicula7);
        AgregarHash(pelicula8);  
        
    }
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Pelicula pelicula = new Pelicula();
        int codigo, año;
        String nombre, clasificacion, duracion, resolucion, imagen;
        int index = 1;
        int actualSize = 0;
        
        if(txtCodigo.getText().trim().isEmpty() || txtNombre.getText().trim().isEmpty() || txtAño.getText().trim().isEmpty()
                || txtClasificacion.getText().trim().isEmpty() || txtDuracion.getText().trim().isEmpty() || 
                txtResolucion.getText().trim().isEmpty() || 
                imagenDireccion.getText().trim().isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(null, "Hay campos vacios");
        }else{
            
            codigo = Integer.parseInt(txtCodigo.getText());
            nombre = txtNombre.getText();
            año = Integer.parseInt(txtAño.getText());
            clasificacion = txtClasificacion.getText();
            duracion = txtDuracion.getText();
            resolucion = txtResolucion.getText();
            imagen = imagenDireccion.getText();

            Pelicula pelicula = new Pelicula();
            pelicula.setCodigo(codigo);
            pelicula.setNombre(nombre);
            pelicula.setAño(año);
            pelicula.setClasificacion(clasificacion);
            pelicula.setDuracion(duracion);
            pelicula.setResolucion(resolucion);
            pelicula.setImagen(imagen);

            this.colaList.deque(pelicula);

            this.ListPelicula = this.colaList.returnListElements();
            //this.pruebaPelicula.add(pelicula);
            AgregarHash(pelicula);
        }
               
        limpiar();
        listar();
        txtCodigo.requestFocus();
        
    }//GEN-LAST:event_btnAgregarActionPerformed
    private void buscarN(String filtro){

       DefaultTableModel tableModel = (DefaultTableModel) this.tablaResultado.getModel();
       Pelicula ResultadoBuscado = new Pelicula();
       filtro = this.txtFiltro.getText();
        ResultadoBuscado = buscarPorNombre(filtro);
            tableModel.setRowCount(0);
            Object[] data = {ResultadoBuscado.getCodigo(), ResultadoBuscado.getNombre(), ResultadoBuscado.getAño(),
                             ResultadoBuscado.getClasificacion(), ResultadoBuscado.getDuracion(), ResultadoBuscado.getResolucion()};
            tableModel.addRow(data);
            System.out.println(ResultadoBuscado.getNombre());
        this.tablaResultado.setModel(tableModel);
    }
    private void buscarC(int filtro){
       DefaultTableModel tableModel = (DefaultTableModel) this.tablaResultado.getModel();
       Pelicula ResultadoBuscado = new Pelicula();
       filtro = Integer.parseInt(this.txtFiltro.getText());
       
        ResultadoBuscado = buscarPorCodigo(filtro);
            tableModel.setRowCount(0);
            Object[] data = {ResultadoBuscado.getCodigo(), ResultadoBuscado.getNombre(), ResultadoBuscado.getAño(),
                             ResultadoBuscado.getClasificacion(), ResultadoBuscado.getDuracion(), ResultadoBuscado.getResolucion()};
            tableModel.addRow(data);
        this.tablaResultado.setModel(tableModel);
    }
    

    
    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
       
    }//GEN-LAST:event_txtNombreKeyTyped

    public boolean eliminarPelicula(String ibanEliminar){
        boolean operacionRealizada = false;
        
           for (Pelicula lista: ListPelicula){
            if (lista.getNombre().equalsIgnoreCase(ibanEliminar)) {
                System.out.println(lista.getNombre());
                ListPelicula.remove(lista);
                operacionRealizada = true;
            }
        } 
  
    return operacionRealizada;
    }
    
    public boolean eliminarPeliculaC(int ibanEliminar){
        boolean operacionRealizada = false;
    
        for (Pelicula lista: ListPelicula){
            if (lista.getCodigo()== Integer.valueOf(ibanEliminar)) {
                System.out.println(lista.getCodigo());
                ListPelicula.remove(lista);
                operacionRealizada = true;
            }
        }
    return operacionRealizada;
    }
    
    private void btnBuscarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPalabraActionPerformed
        try {
            String filtro = txtFiltro.getText();
            if(txtFiltro.getText().trim().isEmpty()){
                javax.swing.JOptionPane.showMessageDialog(null, "Hay campos vacios");
            }else if (filtro.equals(filtro)) {
                buscarN(filtro);
            }         
            buscarC(Integer.parseInt(filtro));
            
        } catch (Exception e) {
            System.out.println("ERROR - NO ES TU  CARRERA" + e.getMessage());
        }
        
        btnDelete.setVisible(true);
    }//GEN-LAST:event_btnBuscarPalabraActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
             String ibanEliminar = txtFiltro.getText();
        //int ibanEliminar = Integer.parseInt(txtCodigo.getText());
        //System.out.println(ibanEliminar);
            if (ibanEliminar.equals(ibanEliminar)) {
                eliminarPelicula(ibanEliminar);
                //System.out.println(tablaResultado.getSelectedRow());
                listar();
            }
            eliminarPeliculaC(Integer.parseInt(ibanEliminar));
            System.out.println(tablaResultado.getSelectedRow());
            listar();
        } catch (Exception e) {
            System.out.println("NO ES STRING- CAMBIATE DE CARRERA" + e.getMessage());
        }    
        btnDelete.setVisible(false);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        //btnDelete.setVisible(false);
        listar();
        //txtFiltro.setText(" ");
    }//GEN-LAST:event_btnListarActionPerformed
 private void Editar(){
     Pelicula NuevaInformacionPelicula = new Pelicula();
     
 }
    private void btnAlquilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlquilarActionPerformed
        RegistrarPelicula registrarPelicula = new RegistrarPelicula();
        registrarPelicula.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAlquilarActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File archivo;
        JFileChooser seleccionarArchivo;
        seleccionarArchivo = new JFileChooser();
        seleccionarArchivo.showOpenDialog(null);
        archivo = seleccionarArchivo.getSelectedFile();
        imagenDireccion.setText(archivo.toString());
        System.out.println("el arrchivo seleccionado es: " + archivo);
        System.out.println("Path actual: " + seleccionarArchivo.getCurrentDirectory());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.intanciarPanelPeliculas();
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAlquilar;
    private javax.swing.JButton btnBuscarPalabra;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel imagenDireccion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaResultado;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtClasificacion;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtResolucion;
    // End of variables declaration//GEN-END:variables
}
