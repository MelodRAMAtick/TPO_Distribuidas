USE [CentroMedico]
GO
/****** Object:  Table [dbo].[Roles]    Script Date: 22/06/2020 23:11:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Roles](
	[idUsr] [int] NOT NULL,
	[nombreRol] [varchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idUsr] ASC,
	[nombreRol] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Roles]  WITH CHECK ADD  CONSTRAINT [FK_RolIdUsr_Usuarios] FOREIGN KEY([idUsr])
REFERENCES [dbo].[Usuarios] ([id])
GO
ALTER TABLE [dbo].[Roles] CHECK CONSTRAINT [FK_RolIdUsr_Usuarios]
GO
