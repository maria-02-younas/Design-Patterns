using System;

public interface ILogger
{
    void log(String msg);
}

public class FileLog : ILogger
{
    public void log(string msg)
    {
        Console.WriteLine("File logging: " + msg);
    }
}

public class DBLog : ILogger
{
    public void log(string msg)
    {
        Console.WriteLine("DB logging: " + msg);
    }
}

public class Logger
{
    public ILogger logger { get; set; }

    public void log_msg(string msg)
    {
        logger.log(msg);
    }
}

class Program
{
    static void Main(string[] args)
    {
        Logger log = new Logger();

        int choice = -1;
        bool flag = false;

        do
        {
            Console.WriteLine("Choose your message log type:\n1. File\n2. DB\n");
            choice = Convert.ToInt32(Console.ReadLine());

            if (choice == 1)
            {
                log.logger = new FileLog();
                log.log_msg("Error message logged!");
            }
            else if (choice == 2)
            {
                log.logger = new DBLog();
                log.log_msg("Error message logged!");
            }
            else
            {
                Console.WriteLine("Please enter correct log type.");
            }

            Console.WriteLine("\nDo you want to continue?\n1. Yes\n2. No");
            int c = Convert.ToInt32(Console.ReadLine());

            if (c == 1)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }

        } while (flag);

        Console.WriteLine("Thank You :)");
    }
}