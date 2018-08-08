import java.net.*; 
import java.io.*; 
class traceroute
{
public static void main(String a[]) throws Exception
{
BufferedReader in =null;
try
{
Runtime r = Runtime.getRuntime();
Process p = r.exec("tracert 132.147.205.18");
if(p==null)
{
System.out.println("There is no reply");
}
in = new BufferedReader(new InputStreamReader(p.getInputStream())); String line;
while((line = in.readLine())!=null)
{ System.out.println(line);
}
in.close();
}
catch(IOException e)
{
 
System.out.println(e.toString());
}
}
}
