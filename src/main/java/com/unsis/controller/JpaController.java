package com.unsis.controller;

import com.unsis.clases.Session;
import com.unsis.controller.exceptions.NonexistentEntityException;
import com.unsis.dao.AccountDao;
import com.unsis.models.entity.Access;
import com.unsis.models.entity.Account;
import com.unsis.models.entity.Area;
import com.unsis.models.entity.Employee;
import com.unsis.models.entity.Product;
import com.unsis.models.entity.Section;
import com.unsis.models.entity.Sales;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.mindrot.jbcrypt.BCrypt;

public class JpaController {

    private final AccessJpaController access;
    private final AccountJpaController account;
    private final AreaJpaController area;
    private final EmployeeJpaController employee;
    private final AccountDao dao = new AccountDao();
    private final SectionJpaController section;
    private final ProductJpaController product;
    private final SalesJpaController sales;
    
    public JpaController() {
        Dotenv env = Dotenv.load();
        String namePu = env.get("PU_NAME");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(namePu);

        this.area = new AreaJpaController(emf);
        this.access = new AccessJpaController(emf);
        this.account = new AccountJpaController(emf);
        this.section = new SectionJpaController(emf);
        this.employee = new EmployeeJpaController(emf);
        this.product = new ProductJpaController(emf);
        this.sales = new SalesJpaController(emf);
    }

    /**
     * Metodo para crear un registro del tipo pasado como parametro
     *
     * @param obj objeto a registrar en base de datos
     */
    public void create(Object obj) {
        switch (obj) {
            case Access accessObj ->
                this.access.create(accessObj);

            case Account accountObj ->
                this.account.create(accountObj);

            case Employee employeeObj -> 
                this.employee.create(employeeObj);

            case Section sectionObj ->
                this.section.create(sectionObj);

            case Area areaObj ->
                this.area.create(areaObj);

            case Product productObj ->
                this.product.create(productObj);

            case Sales salesObj ->
                this.sales.create(salesObj);

            default -> {
                System.err.println("Invalid entity type");
            }
        }
    }

    /**
     * Metodo para eliminar un registro de base de datos
     *
     * @param obj objeto a eliminar en base de datos
     */
    public void destroy(Object obj) {
        try {
            switch (obj) {
                case Access accessObj ->
                    this.access.destroy(accessObj.getId());

                case Account accountObj ->
                    this.account.destroy(accountObj.getId());

                case Employee employeeObj ->
                    this.employee.destroy(employeeObj.getId());

                case Section sectionObj ->
                    this.section.destroy(sectionObj.getId());

                case Area areaObj ->
                    this.area.destroy(areaObj.getId());

                case Product productObj ->
                    this.product.destroy(productObj.getId());

                case Sales salesObj ->
                    this.sales.destroy(salesObj.getId());
                    
                default -> {
                    System.err.println("Invalid entity type");
                }
            }
        } catch (NonexistentEntityException e) {
            System.err.println("Error on destroy generic: " + obj.getClass() + "\n" + e.getMessage());
        }
    }

    /**
     * Metodo para editar un registro de base de datos
     *
     * @param obj objeto a editar en base de datos
     */
    public void edit(Object obj) {
        try {
            switch (obj) {
                case Access accessObj ->
                    this.access.edit(accessObj);

                case Account accountObj ->
                    this.account.edit(accountObj);

                case Employee employeeObj ->
                    this.employee.edit(employeeObj);

                case Section sectionObj ->
                    this.section.edit(sectionObj);

                case Area areaObj ->
                    this.area.edit(areaObj);
                    
                case Product productObj ->
                    this.product.edit(productObj);

                case Sales salesObj ->
                    this.sales.edit(salesObj);
                    
                default -> {
                    System.err.println("Tas mal");
                }
            }
        } catch (Exception e) {
            System.err.println("Error on edit generic: " + obj.getClass() + "\n" + e.getMessage());
        }
    }

    /**
     * Metodo para buscar una entidad en especifico de un tipo en especifico
     *
     * @param <T> Tipo de dato del retorno esperado
     * @param id Id del registro a buscar
     * @param entityClass Entidad del objeto que se esoera recibir
     * @return Registro de la base de datos con el id indicado y del tipo
     * esperado
     */
    public <T> T findEntityById(int id, Class<T> entityClass) {
        try {
            switch (entityClass.getSimpleName()) {
                case "Access" -> {
                    return (T) this.access.findAccess(id);
                }
                case "Account" -> {
                    return (T) this.account.findAccount(id);
                }
                case "Employee" -> {
                    return (T) this.employee.findEmployee(id);
                }
                case "Section" -> {
                    return (T) this.section.findSection(id);
                }
                case "Area" -> {
                    return (T) this.section.findSection(id);
                }
                case "Product" -> {
                    return (T) this.section.findSection(id);
                }
                case "Sales" -> {
                    return (T) this.section.findSection(id);
                }
                default -> {
                    System.err.println("Invalid entity type");
                    return null;
                }
            }
        } catch (Exception e) {
            System.err.println("Error while finding entity: " + entityClass.getSimpleName() + "\n" + e.getMessage());
            return null;
        }
    }

    /**
     * Busca todos los registros de una tabla en especifico
     *
     * @param <T> Clase de la lista de la que esperan resultados
     * @param entityClass entidad de la que se esperan resultados
     * @return ArrayList con todos los registros de la clase especificada
     */
    public <T> ArrayList<T> findAllEntities(Class<T> entityClass) {
        String className = entityClass.getSimpleName();
        switch (className) {
            case "Employee" -> {
                return new ArrayList<>((Collection<? extends T>) this.employee.findEmployeeEntities());
            }
            case "Access" -> {
                return new ArrayList<>((Collection<? extends T>) this.access.findAccessEntities());
            }
            case "Account" -> {
                return new ArrayList<>((Collection<? extends T>) this.account.findAccountEntities());
            }
            case "Section" -> {
                return new ArrayList<>((Collection<? extends T>) this.section.findSectionEntities());
            }
            case "Product" -> {
                return new ArrayList<>((Collection<? extends T>) this.product.findProductEntities());
            }
            case "Sales" -> {
                return new ArrayList<>((Collection<? extends T>) this.sales.findSalesEntities());
            }
            default -> {
                System.err.println("Invalid entity type");
                return null;
            }
        }
    }
    
    /**
     *
     * @param user
     * @param pass
     * @return
     */
    public boolean auth(String user, String pass) {
        Account account = dao.auth(user);

        if (account == null) {
            return false;
        }
        
        Session.setAccount(account);
        // Verificar si la contraseña ingresada coincide con la contraseña hasheada
        return  BCrypt.checkpw(pass, account.getContrasena());
//        return true;

    }
}
