@echo off

if not "%1"=="am_admin" (powershell start -verb runas '%0' am_admin & exit /b)

ECHO This will rebuild the boot configuration data on your boot drive

pause

diskpart
list vol
sel vol
assign letter T
exit
T:
cd efi/microsoft/boot
ren BCD BCD.old
bcdboot C:\windows /l en-us /s T:all