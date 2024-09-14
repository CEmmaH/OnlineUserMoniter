This is a small web-based project that counts and displays the current number of online users in a Java web application. 

How it work

1. When a user visits the website, a new session is created, and the UserSessionListener increments the online user count.
2. The online user count is stored in the ServletContext, making it globally accessible.
3. When the user logout, the user count is decremented.
4. The number of online users is displayed on a JSP page by fetching the value from the ServletContext.
