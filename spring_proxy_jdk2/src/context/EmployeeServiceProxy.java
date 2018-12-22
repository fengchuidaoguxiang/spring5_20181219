package context;

import domain.Employee;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import service.IEmployeeService;

public final class EmployeeServiceProxy
        extends Proxy
        implements IEmployeeService
{
    private static Method methodEquals;
    private static Method methodUpdate;
    private static Method methodToString;
    private static Method methodSave;
    private static Method methodHashCode;

    public EmployeeServiceProxy(InvocationHandler paramInvocationHandler)
    {
        super(paramInvocationHandler);
    }

    static
    {
        try
        {
            methodEquals = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
            methodToString = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
            methodHashCode = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);

            methodUpdate = Class.forName("service.IEmployeeService").getMethod("update", new Class[] { Class.forName("domain.Employee") });
            methodSave = Class.forName("service.IEmployeeService").getMethod("save", new Class[] { Class.forName("domain.Employee") });

        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
            throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
            throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
        }
    }
    
    public final boolean equals(Object paramObject)
    {
        try
        {
            return ((Boolean)this.h.invoke(this, methodEquals, new Object[] { paramObject })).booleanValue();
        }
        catch (Error|RuntimeException localError)
        {
            throw localError;
        }
        catch (Throwable localThrowable)
        {
            throw new UndeclaredThrowableException(localThrowable);
        }
    }

    public final void update(Employee paramEmployee)
    {
        try
        {
            this.h.invoke(this, methodUpdate, new Object[] { paramEmployee });
            return;
        }
        catch (Error|RuntimeException localError)
        {
            throw localError;
        }
        catch (Throwable localThrowable)
        {
            throw new UndeclaredThrowableException(localThrowable);
        }
    }

    public final String toString()
    {
        try
        {
            return (String)this.h.invoke(this, methodToString, null);
        }
        catch (Error|RuntimeException localError)
        {
            throw localError;
        }
        catch (Throwable localThrowable)
        {
            throw new UndeclaredThrowableException(localThrowable);
        }
    }

    public final void save(Employee paramEmployee)
    {
        try
        {
            this.h.invoke(this, methodSave, new Object[] { paramEmployee });
            return;
        }
        catch (Error|RuntimeException localError)
        {
            throw localError;
        }
        catch (Throwable localThrowable)
        {
            throw new UndeclaredThrowableException(localThrowable);
        }
    }

    public final int hashCode()
    {
        try
        {
            return ((Integer)this.h.invoke(this, methodHashCode, null)).intValue();
        }
        catch (Error|RuntimeException localError)
        {
            throw localError;
        }
        catch (Throwable localThrowable)
        {
            throw new UndeclaredThrowableException(localThrowable);
        }
    }

   
}
