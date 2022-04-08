@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO this will run a system restore with the last generated restore point on your system

pause

net start vss
rstrui.exe /offline:C:\windows=active