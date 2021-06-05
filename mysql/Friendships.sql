/* Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados. */
select users.first_name, users.last_name, user2.first_name as friend_first_name, user2.last_name as friend_last_name from users
left join friendships on users.id = friendships.friend_id
left join users as user2 on user2.id = friendships.user_id
where users.id = 4;

/* Devuelve el recuento de todas las amistades. */
select users.first_name, users.last_name, user2.first_name as friend_first_name, user2.last_name as friend_last_name from users 
left join friendships on users.id = friendships.user_id
inner join users as user2 on user2.id = friendships.friend_id;

/* Descubre quién tiene más amigos y devuelve el recuento de sus amigos. */
select users.first_name, users.last_name, count(friendships.friend_id) AS NumberOfFriends from users 
left JOIN friendships on users.id = friendships.user_id
left join users as user2 on user2.id = friendships.friend_id
GROUP BY user_id;

/* Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark. */
INSERT INTO users (first_name, last_name)
VALUES ('cristian', 'guzman');
INSERT INTO friendships (user_id, friend_id)
values (6,2),(6,4),(6,5);

/* Devuelve a los amigos de Eli en orden alfabético. */
select users.first_name, users.last_name, user2.first_name as friend_first_name, user2.last_name as friend_last_name from users 
left join friendships on users.id = friendships.user_id
inner join users as user2 on user2.id = friendships.friend_id
where users.first_name = 'Eli' order by friend_first_name, friend_last_name ASC;

/* Eliminar a Marky Mark de los amigos de Eli. */
DELETE FROM friendships WHERE friendships.id = (select friendships.id from friendships
inner join users on users.id = friendships.user_id
where friendships.user_id = 2 and friendships.friend_id = 5);

/* Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos */
select users.first_name, users.last_name, user2.first_name as friend_first_name, user2.last_name as friend_last_name from users 
left join friendships on users.id = friendships.user_id
inner join users as user2 on user2.id = friendships.friend_id;

        


