# Header
Name: agility-adapters-azure-trafficmanager
Summary: Agility Service Pack for Azure Traffic Manager
Version: %rpm_version
Release: %rpm_revision
Vendor: CSC Agility Dev
URL: http://www.csc.com/
Group: Services/Cloud
License: Commercial
BuildArch: noarch
Requires: jre >= 1.7.0
Requires: agility-adapters-core-azure

# Sections
%description
Service pack adapter between Agility Platform and Microsoft Azure Traffic Manager.

%license_text

%files
%defattr(644,smadmin,smadmin,755)
/opt/agility-platform/deploy/*
