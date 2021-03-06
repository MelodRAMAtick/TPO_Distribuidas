USE [CentroMedico]
GO
/****** Object:  Table [dbo].[Medicos]    Script Date: 22/06/2020 23:11:04 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Medicos](
	[idUsr] [int] NOT NULL,
	[especialidad] [varchar](45) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[idUsr] ASC,
	[especialidad] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Medicos]  WITH CHECK ADD  CONSTRAINT [FK_MedicoIdUsr_Usuarios] FOREIGN KEY([idUsr])
REFERENCES [dbo].[Usuarios] ([id])
GO
ALTER TABLE [dbo].[Medicos] CHECK CONSTRAINT [FK_MedicoIdUsr_Usuarios]
GO
