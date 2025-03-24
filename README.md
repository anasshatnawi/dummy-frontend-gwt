# GWT Dummy Application
This is a simple GWT application that demonstrates basic features such as:

1. A text input field in a form.
2. A button that, when clicked, displays the entered text on the page.

## Project Structure
```
gwt-dummy-application/
├── pom.xml
├── README.md
└── src
    └── main
        ├── java
        │   └── edu
        │       └── example
        │           └── client
        │               ├── GWTDummyApp.java      // Entry point class
        │               ├── PageOne.java          // A page with a form and a button
        │               └── PageTwo.java          // A page displaying a simple table
        │           └── GWTDummyApp.gwt.xml         // GWT module XML file (must be in the proper package)
        ├── resources
        └── webapp
            ├── GWTDummyApp.html     // Host page for the GWT app
            ├── GWTDummyApp.css      // CSS for the app
            ├── favicon.ico
            ├── images
            │   └── sign_check_icon.png
            └── WEB-INF
                └── web.xml
```

## Prerequisites
- **Java:** JDK 1.8 (or later)
- **Maven:** Apache Maven (3.x)
- **GWT SDK:** GWT 2.12.2  
  Download the GWT SDK 2.12.2 from the [GWT Project website](http://www.gwtproject.org/download.html).

> **Important:**  
> To ensure the GWT SDK is accessible from the command line, you should set an environment variable (e.g., `GWT_HOME`) pointing to the SDK's installation directory and add it to your `PATH`.  
>  
> **For Windows:**  
> 1. Set `GWT_HOME` to, for example, `C:\Program Files\GWT\gwt-2.12.2`.  
> 2. Add `%GWT_HOME%` to your `PATH` environment variable.  
>  
> **For Unix/Linux/MacOS:**  
> 1. Set `GWT_HOME` to, for example, `/usr/local/gwt/gwt-2.12.2`.  
> 2. Add `$GWT_HOME` to your `PATH`.  
>  
> This allows you to use GWT tools from anywhere in your CLI.

## Building the Project
Open a terminal in the project directory and run:

```bash
mvn clean package
```

This command will compile the Java sources, build your GWT module, and package your application as a WAR file.

## Running the Application in Development Mode
To launch the application in development mode using the embedded Jetty server, run:

```bash
mvn gwt:run
```

Once the server starts, open your browser and navigate to:

```
http://127.0.0.1:8888/GWTDummyApp.html
```

You should see your application running.