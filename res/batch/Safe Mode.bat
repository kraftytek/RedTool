@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will turn off your PC and boot it in safe mode

pause

bcdedit /set {default} safeboot network

shutdown /r