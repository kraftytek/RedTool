@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will run a system file check on your system. This may take a while

pause

sfc /scannow