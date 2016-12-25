BOOST INSTALATION: 

DOWNLOAD LATEST BOOST LIBRARY FROM THE WEB, THEN:

From Visual Studio's File menu, select New > Project…

In the left-hand pane of the resulting New Project dialog, select Visual C++ > Win32.

In the right-hand pane, select Win32 Console Application (VS8.0) or Win32 Console Project (VS7.1).

In the name field, enter “example”

Right-click example in the Solution Explorer pane and select Properties from the resulting pop-up menu

In Configuration Properties > C/C++ > General > Additional Include Directories, enter the path to the Boost root directory, for example

    C:\Program Files\boost\boost_1_55_0

In Configuration Properties > C/C++ > Precompiled Headers, change Use Precompiled Header (/Yu) to Not Using Precompiled Headers.