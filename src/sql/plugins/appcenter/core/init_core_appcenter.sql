    
--
-- Data for table core_admin_right
--
DELETE FROM core_admin_right WHERE id_right = 'APPCENTER_MANAGEMENT';
INSERT INTO core_admin_right (id_right,name,level_right,admin_url,description,is_updatable,plugin_name,id_feature_group,icon_url,documentation_url, id_order ) VALUES 
('APPCENTER_MANAGEMENT','appcenter.adminFeature.ManageAppCenter.name',1,'jsp/admin/plugins/appcenter/ManageDemands.jsp','appcenter.adminFeature.ManageAppCenter.description',0,'appcenter',NULL,NULL,NULL,4);


--
-- Data for table core_user_right
--
DELETE FROM core_user_right WHERE id_right = 'APPCENTER_MANAGEMENT';
INSERT INTO core_user_right (id_right,id_user) VALUES ('APPCENTER_MANAGEMENT',1);
--
-- Roles creation
--
INSERT INTO core_admin_role ( role_key, role_description ) VALUES
    ( 'BILD','Role définissant les droits des administrateurs BILD'),
    ( 'BIAD','Role définissant les droits des administrateurs BIAD');

--
-- Roles assignment
--
INSERT INTO core_user_role (role_key, id_user) VALUES ('BIAD', 1);
INSERT INTO core_user_role (role_key, id_user) VALUES ('BILD', 1);

UPDATE core_admin_user SET password_max_valid_date = NULL;
