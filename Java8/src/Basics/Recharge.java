package Basics;
import java.util.*;

class Plan
{
    private int planId;
    private String description;
    private double price;
    private int validity;

    public Plan(int planId, String description, double price, int validity)
    {
        this.planId = planId;
        this.description = description;
        this.price = price;
        this.validity = validity;
    }

    // Getters and setters
    public int getPlanId() 
    {
        return planId;
    }

    public void setPlanId(int planId)
    {
        this.planId = planId;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

    public int getValidity()
    {
        return validity;
    }

    public void setValidity(int validity) 
    {
        this.validity = validity;
    }
}

class User 
{
    private String username;
    private String password;
    private String email;
    private String phoneNumber;

    public User(String username, String password, String email, String phoneNumber) 
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getUsername() 
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}

interface PlanRepository 
{
    List<Plan> getAllPlans();
    Plan getPlanById(int planId);
}

interface UserRepository 
{
    User getUserByUsername(String username);
    boolean authenticate(String username, String password);
    void addUser(User user);
}

class PlanServiceImpl implements PlanRepository 
{
    private List<Plan> plans;

    public PlanServiceImpl() 
    {
        plans = new ArrayList<>();
        plans.add(new Plan(1, "Plan 1", 10.0, 30));
        plans.add(new Plan(2, "Plan 2", 20.0, 60));
        plans.add(new Plan(3, "Plan 3", 30.0, 90));
    }

    @Override
    public List<Plan> getAllPlans()
    {
        return plans;
    }

    @Override
    public Plan getPlanById(int planId) 
    {
        for (Plan plan : plans) 
        {
            if (plan.getPlanId() == planId) 
            {
                return plan;
            }
        }
        return null;
    }
}

class UserServiceImpl implements UserRepository
{
    private Map<String, User> users;

    public UserServiceImpl() 
    {
        users = new HashMap<>();
        users.put("user1", new User("user1", "password1", "user1@example.com", "1234567890"));
        users.put("user2", new User("user2", "password2", "user2@example.com", "9876543210"));
    }

    @Override
    public User getUserByUsername(String username)
    {
        return users.get(username);
    }

    @Override
    public boolean authenticate(String username, String password)
    {
        User user = users.get(username);
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public void addUser(User user)
    {
        users.put(user.getUsername(), user);
    }
}

public class Recharge 
{

    public static void main(String[] args)
    {
        PlanRepository planRepository = new PlanServiceImpl();
        UserRepository userRepository = new UserServiceImpl();

        // Example usage
        System.out.println("Available plans:");
        List<Plan> plans = planRepository.getAllPlans();
        for (Plan plan : plans) 
        {
            System.out.println(plan.getPlanId() + ": " + plan.getDescription() + " - $" + plan.getPrice());
        }
    

        // Example login
        String username = "user1";
        String password = "password1";
        if (userRepository.authenticate(username, password)) 
        {
            System.out.println("Login successful!");
            User user = userRepository.getUserByUsername(username);
            System.out.println("Welcome, " + user.getUsername());
        } 
        else 
        {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
}





