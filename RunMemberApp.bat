echo off
rem =========================================================================
rem                 Steps to execute this file : 
rem 1. Copy the folder 'MemberApp' into a drive e.g. C drive in windows.
rem 2. Set the HOME and JAVA PATH.
rem 3. Double click RunMemberApp.bat 
 
rem =========================================================================

set HOME=C:\MemberApp

set PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_151\bin;

javac -cp  %HOME%\com\dm\lib\hazelcast-all-3.10.1.jar  -Xlint:unchecked %HOME%\com\dm\sample\*.Java

java -cp %HOME%\com\dm\lib\hazelcast-all-3.10.1.jar;%HOME%; com.dm.sample.CreateMember
